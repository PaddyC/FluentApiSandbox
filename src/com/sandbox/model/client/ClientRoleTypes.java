package com.sandbox.model.client;

public enum ClientRoleTypes {
	
	LIFE_ASSURED("LA", "Life Assured"),
	OWNER("OW", "Owner"),
	PAYEE("PY", "Payee"),
	JOINT_OWNER("JO", "Joint Owner"),
	ASSIGNEE("AS", "Assignee");
	
	private String type;
	private String description;
	private ClientRoleTypes(String type, String description) {
		this.type = type;
		this.description = description;
	}
	
	public String getType() {
		return type;
	}
	
	public String getDescription() {
		return description;
	}

}
