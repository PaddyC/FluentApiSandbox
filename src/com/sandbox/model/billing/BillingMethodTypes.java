package com.sandbox.model.billing;

public enum BillingMethodTypes {
	
	CASH("C", "Cash"),
	DIRECT_DEBIT("D", "Direct Debit"),
	SALARY("S", "Salary Deduction"),
	CHEQUE("Q", "Cheque");
	
	private String type;
	private String description;
	private BillingMethodTypes(String type, String description) {
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
