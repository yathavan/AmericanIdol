package com.americanidol.comapp.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.americanidol.comapp.domain.Response;

public interface ResponseHandler {
	List<String> detectObjects(MultipartFile file);
	List<Response> getResponses();
}
