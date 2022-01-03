package com.americanidol.comapp.service;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.americanidol.comapp.ai.ObjectDetection;
import com.americanidol.comapp.domain.Item;
import com.americanidol.comapp.domain.Response;
import com.americanidol.comapp.repo.ItemRepository;

import ai.djl.modality.cv.output.DetectedObjects;

@Service 
public class ResponseHandlerImpl implements ResponseHandler{
	
	private static final Logger logger = LoggerFactory.getLogger(ResponseHandlerImpl.class);
	
	@Autowired
	ItemRepository itemRepository;
	
	@Override
	public List<String> detectObjects(MultipartFile file) {
		List<String> objects = new ArrayList<>();
		try {
			InputStream inputStream =  new BufferedInputStream(file.getInputStream());
			DetectedObjects detection = ObjectDetection.predict(inputStream);
	        logger.info("{}", detection);
	        if(detection != null) {
	        	List<DetectedObjects.DetectedObject> listOfItems = detection.items();
	            for (DetectedObjects.DetectedObject result : listOfItems) {
	            	if(result.getClassName() != null)
	            		objects.add(result.getClassName());
	            }
	        }
		} catch (Exception e) {
			logger.error("Error occoured while processing", e);
		}
		return objects;
	}
	
	@Override
	public Map<String, List<String>> getResponses(List<String> objects) {
		Map<String, List<String>> results = new HashMap<String, List<String>>();
		for(String object : objects) {
			Item item = itemRepository.findByName(object);
			if(item != null && item.getResponses() != null && !item.getResponses().isEmpty()) {
				List<String> responses = new ArrayList<>();
				item.getResponses().forEach(r->responses.add(r.getDescription())); 
				results.put(object, responses);
			}
		}
		return results;
	}

}
