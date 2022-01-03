package com.americanidol.comapp.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.americanidol.comapp.domain.Response;
import com.americanidol.comapp.dto.ErrorDto;
import com.americanidol.comapp.dto.ResponseDto;
import com.americanidol.comapp.dto.ResultDto;
import com.americanidol.comapp.service.ResponseHandler;

@RestController
public class CommunicationController {
	
	private static final Logger logger = LoggerFactory.getLogger(CommunicationController.class);
	
	@Autowired
	ResponseHandler responseHandler;
	
	@PostMapping(path="/search", consumes = { MediaType.MULTIPART_FORM_DATA_VALUE })
	public ResponseDto proessRequest(@RequestPart("file") MultipartFile file) {
		ResponseDto response = new ResponseDto();
		if(file != null) {
			try {
				List<String> objects = responseHandler.detectObjects(file);
				if(!objects.isEmpty()) {
					Map<String, List<String>> results = responseHandler.getResponses(objects);
					if(!results.isEmpty()) {
						buildResponse(results, response);
					}else {
						response.setError(new ErrorDto("E404", "No response found"));
					}
				}else {
					response.setError(new ErrorDto("E405", "Unable to detect objects"));
				}
			}catch(Exception e) {
				logger.error("Error occoured while processing", e);
				response.setError(new ErrorDto("E500", "Error occoured while processing"));
			}
		}else {
			response.setError(new ErrorDto("E400", "Image is empty"));
		}
		
		return response;
	}
	
	private void buildResponse(Map<String, List<String>> results, ResponseDto response) {
		for (Map.Entry<String, List<String>> entry : results.entrySet()) {
			ResultDto result = new ResultDto();
			result.setItemName(entry.getKey());
			result.setResponseText(entry.getValue());
			response.getResults().add(result);
		}
	}
}
