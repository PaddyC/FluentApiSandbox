package com.sandbox.model.product;

public class Product {
	
	private String productType;
	
	private String productCode;
	
	private Integer productCategory;
	
	private String productDescription;
	
	private BasisOfCover basisOfCover;
	
	
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCategory(Integer productCategory) {
		this.productCategory = productCategory;
	}
	public Integer getProductCategory() {
		return productCategory;
	}
	public void setBasisOfCover(BasisOfCover basisOfCover) {
		this.basisOfCover = basisOfCover;
	}
	public BasisOfCover getBasisOfCover() {
		return basisOfCover;
	}

}
