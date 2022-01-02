package com.americanidol.comapp.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.americanidol.comapp.dto.ResponseDto;

@RestController
public class CommunicationController {
	
	@PostMapping(path="/search", consumes = { MediaType.MULTIPART_FORM_DATA_VALUE })
	public ResponseDto proessRequest(@RequestPart("file") MultipartFile file) {
		
		ResponseDto response = new ResponseDto();
		
		return response;
	}
}
