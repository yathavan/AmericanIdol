package com.americanidol.comapp.dto;

import java.util.List;

public class ResponseDto {
	
	private String itemType;
	private String itemName;
	private List<String> responseText;
	private ErrorDto error;
	
	public ResponseDto() {
		
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public List<String> getResponseText() {
		return responseText;
	}

	public void setResponseText(List<String> responseText) {
		this.responseText = responseText;
	}
	
	public ErrorDto getError() {
		return error;
	}

	public void setError(ErrorDto error) {
		this.error = error;
	}

	@Override
	public String toString() {
		return "ResponseDto [itemType=" + itemType + ", itemName=" + itemName + ", responseText=" + responseText + "]";
	}
	
	
}
