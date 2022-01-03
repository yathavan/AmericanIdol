package com.americanidol.comapp.dto;

import java.util.List;

public class ResultDto {
	
	private String itemType;
	private String itemName;
	private List<String> responseText;
	
	public ResultDto() {
		
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

	@Override
	public String toString() {
		return "ResponseDto [itemType=" + itemType + ", itemName=" + itemName + ", responseText=" + responseText + "]";
	}
	
	
}
