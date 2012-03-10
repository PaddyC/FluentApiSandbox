package com.sandbox.builder;

import com.sandbox.model.billing.BillingMethod;
import com.sandbox.model.billing.BillingMethodTypes;

public class BillingMethodBuilder {
	
	private BillingMethod billingMethod;
	
	public static BillingMethodBuilder create() {
		return new BillingMethodBuilder();
	}
	
	public BillingMethodBuilder withType(String billingMethodType) {
		BillingMethodTypes thisBillingMethodType = Enum.valueOf(BillingMethodTypes.class, billingMethodType);
		billingMethod.setBillingMethodType(thisBillingMethodType.getType());
		billingMethod.setBillingMethodDescription(thisBillingMethodType.getDescription());
		return this;
	}
	
	private BillingMethodBuilder() {
		this.billingMethod = new BillingMethod();
	}
	
	public BillingMethod build() {
		return billingMethod;
	}

}
