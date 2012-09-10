package com.sandbox.fluent.assertions;

import org.fest.assertions.Assertions;
import org.fest.assertions.GenericAssert;

public class InventoryDetailsAssert extends GenericAssert<InventoryDetailsAssert, InventoryDetails> {

	protected InventoryDetailsAssert(InventoryDetails actual) {
		super(InventoryDetailsAssert.class, actual);
	}
	
	public static InventoryDetailsAssert assertThat(InventoryDetails actual) {
		return new InventoryDetailsAssert(actual);
	}
	
	public InventoryDetailsAssert hasCategory(Integer category) {
		Assertions.assertThat(actual.getCategory().equals(category));
		return this;
	}
	
	public InventoryDetailsAssert hasProductClass(Integer productClass) {
		Assertions.assertThat(actual.getProductClass().equals(productClass));
		return this;
	}
	
	public InventoryDetailsAssert hasProductFamily(String productFamily) {
		Assertions.assertThat(actual.getProductFamily().equalsIgnoreCase(productFamily));
		return this;
	}

}
