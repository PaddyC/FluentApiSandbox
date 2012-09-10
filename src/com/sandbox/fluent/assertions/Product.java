package com.sandbox.fluent.assertions;

public class Product {
	
	private String name;
	private String shortDescription;
	private String longDescription;
	
	private InventoryDetails inventoryDetails;
	
	public Product() {
	}
	
	public Product(String name, String shortDesc, String longDesc, InventoryDetails inventoryDetails) {
		this.name = name;
		this.shortDescription = shortDesc;
		this.longDescription = longDesc;
		this.inventoryDetails = inventoryDetails;
	}

	public void setInventoryDetails(InventoryDetails inventoryDetails) {
		this.inventoryDetails = inventoryDetails;
	}

	public InventoryDetails getInventoryDetails() {
		return inventoryDetails;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
