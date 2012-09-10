package com.sandbox.fluent.assertions.builders;

import com.sandbox.fluent.assertions.InventoryDetails;

public class InventoryDetailsBuilder {
	
	private InventoryDetails inventoryDetails;
	
	private InventoryDetailsBuilder() {
		this.inventoryDetails = new InventoryDetails();
	}
	
	public static InventoryDetailsBuilder create() {
		return new InventoryDetailsBuilder();
	}
	
	public InventoryDetailsBuilder withCategory(Integer category) {
		inventoryDetails.setCategory(category);
		return this;
	}
	
	public InventoryDetailsBuilder withClass(Integer productClass) {
		inventoryDetails.setProductClass(productClass);
		return this;
	}
	
	public InventoryDetailsBuilder withFamily(String family) {
		inventoryDetails.setProductFamily(family);
		return this;
	}
	
	public InventoryDetails build() {
		return inventoryDetails;
	}

}
