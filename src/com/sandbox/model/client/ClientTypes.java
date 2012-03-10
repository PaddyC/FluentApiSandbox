package com.sandbox.model.client;

public enum ClientTypes {
	
	PERSONAL("P", "Personal"),
	CORPORATE("C", "Organisational");
	
	private String type;
	private String description;
	private ClientTypes(String type, String description) {
		this.type = type;
		this.description = description;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescription() {
		return description;
	}

}
