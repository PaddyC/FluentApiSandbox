package com.sandbox.model.client;


public class ClientType {
	
	private String clientTypeCode;
	private String clientTypeDescription;
	
	public ClientType(ClientTypes thisClientType) {
		this.clientTypeCode = thisClientType.getType();
		this.clientTypeDescription = thisClientType.getDescription();
	}
	
	public void setClientTypeCode(String clientTypeCode) {
		this.clientTypeCode = clientTypeCode;
	}
	public String getClientTypeCode() {
		return clientTypeCode;
	}
	public void setClientTypeDescription(String clientTypeDescription) {
		this.clientTypeDescription = clientTypeDescription;
	}
	public String getClientTypeDescription() {
		return clientTypeDescription;
	}
	

}
