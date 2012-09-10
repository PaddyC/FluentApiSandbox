package com.sandbox.fluent.assertions.builders;

import com.sandbox.fluent.assertions.InventoryDetails;
import com.sandbox.fluent.assertions.Product;

public class ProductBuilder {
	
	private Product product;
	
	private ProductBuilder() {
		this.product = new Product();
	}
	
	public static ProductBuilder create() {
		return new ProductBuilder();
	}
	
	public ProductBuilder withName(String name) {
		product.setName(name);
		return this;
	}
	
	public ProductBuilder withShortDescription(String shortDesc) {
		product.setShortDescription(shortDesc);
		return this;
	}
	
	public ProductBuilder withLongDescription(String longDesc) {
		product.setLongDescription(longDesc);
		return this;
	}
	
	public ProductBuilder withInventoryDetails(InventoryDetails inventoryDetails) {
		product.setInventoryDetails(inventoryDetails);
		return this;
	}
	
	public ProductBuilder withInventoryDetails(InventoryDetailsBuilder inventoryDetailsBuilder) {
		product.setInventoryDetails(inventoryDetailsBuilder.build());
		return this;
	}
	
	public Product build() {
		return product;
	}

}
