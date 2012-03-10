package com.sandbox.model.contractstatus;

public class ContractStatus {
	
	private String statusCode;
	private String statusDescription;
	
	public ContractStatus() {
	}
	
	public ContractStatus(ContractStatusTypes contractStatusType) {
		this.statusCode = contractStatusType.getType();
		this.statusDescription = contractStatusType.getDescription();
	}
	
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}
	public String getStatusDescription() {
		return statusDescription;
	}

}
