package com.sandbox.fluent.assertions;

public class InventoryDetails {
	
	private Integer category;
	private Integer productClass;
	private String productFamily;
	
	public InventoryDetails() {
	}
	
	public InventoryDetails(Integer category, Integer productClass, String productFamily) {
		this.category = category;
		this.productClass = productClass;
		this.productFamily = productFamily;
	}
	
	public void setCategory(Integer category) {
		this.category = category;
	}
	public Integer getCategory() {
		return category;
	}
	public void setProductClass(Integer productClass) {
		this.productClass = productClass;
	}
	public Integer getProductClass() {
		return productClass;
	}
	public void setProductFamily(String productFamily) {
		this.productFamily = productFamily;
	}
	public String getProductFamily() {
		return productFamily;
	}

}
