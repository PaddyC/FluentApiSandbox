package com.sandbox.model.billing;

public class BillingMethod {
	
	private String billingMethodType;
	private String billingMethodDescription;
	
	public BillingMethod() {
	}
	
	public BillingMethod(BillingMethodTypes billingMethod) {
		this.billingMethodType = billingMethod.getType();
		this.billingMethodDescription = billingMethod.getDescription();
	}
	
	public void setBillingMethodType(String billingMethodType) {
		this.billingMethodType = billingMethodType;
	}
	public String getBillingMethodType() {
		return billingMethodType;
	}
	public void setBillingMethodDescription(String billingMethodDescription) {
		this.billingMethodDescription = billingMethodDescription;
	}
	public String getBillingMethodDescription() {
		return billingMethodDescription;
	}

}
