package com.americanidol.comapp.service;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

import com.americanidol.comapp.ai.ObjectDetection;
import com.americanidol.comapp.domain.Response;

import ai.djl.modality.cv.output.DetectedObjects;


public class ResponseHandlerImpl implements ResponseHandler{
	
	private static final Logger logger = LoggerFactory.getLogger(ResponseHandlerImpl.class);
			
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
	public List<Response> getResponses() {
		
		return null;
	}

}
