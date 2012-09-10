package com.sandbox.fluent.assertions;

import org.fest.assertions.Assertions;
import org.fest.assertions.GenericAssert;


public class ProductAssert extends GenericAssert<ProductAssert, Product> {

	protected ProductAssert(Product actual) {
		super(ProductAssert.class, actual);
	}
	
	public static ProductAssert assertThat(Product actual) {
		return new ProductAssert(actual);
	}

	public ProductAssert hasName(String name) {
		Assertions.assertThat(actual.getName().equalsIgnoreCase(name));
		return this;
	}
	
	public ProductAssert hasShortDescription(String shortDescription) {
		Assertions.assertThat(actual.getShortDescription().equalsIgnoreCase(shortDescription));
		return this;
	}
	
	public ProductAssert hasLongDescription(String longDescription) {
		Assertions.assertThat(actual.getLongDescription().equalsIgnoreCase(longDescription));
		return this;
	}
	
	public ProductAssert hasInventoryDetails() {
		Assertions.assertThat(actual.getInventoryDetails() != null);
		return this;
	}
}
