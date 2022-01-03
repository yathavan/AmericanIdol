package com.americanidol.comapp.service;

import java.util.List;
import java.util.Map;

import org.springframework.web.multipart.MultipartFile;


public interface ResponseHandler {
	List<String> detectObjects(MultipartFile file);
	Map<String, List<String>> getResponses(List<String> objects);
}
