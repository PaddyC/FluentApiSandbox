package com.sandbox.model.contractstatus;

public enum ContractStatusTypes {
	
	IN_FORCE("IF", "In Force"),
	PREMIUM_DUE("PD", "Premium Due"),
	IN_ALTERATION("IA", "In Alteration"),
	PAID_UP("PU", "Paid Up");
	
	
	private String type;
	private String description;
	
	private ContractStatusTypes(String type, String description) {
		this.type = type;
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public String getType() {
		return type;
	}
	
	

}
