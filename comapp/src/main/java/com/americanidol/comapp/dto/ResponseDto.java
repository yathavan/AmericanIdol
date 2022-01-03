package com.americanidol.comapp.dto;

import java.util.ArrayList;
import java.util.List;

public class ResponseDto {
	
	private List<ResultDto> results;
	private ErrorDto error;
	
	public ResponseDto() {
		
	}
	
	public List<ResultDto> getResults() {
		if(results == null)
			results = new ArrayList<ResultDto>();
		return results;
	}

	public void setResults(List<ResultDto> results) {
		this.results = results;
	}

	public ErrorDto getError() {
		return error;
	}

	public void setError(ErrorDto error) {
		this.error = error;
	}

}
