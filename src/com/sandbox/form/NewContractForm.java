package com.sandbox.form;

import java.sql.Date;

import com.sandbox.model.client.Client;
import com.sandbox.model.product.Product;

public class NewContractForm {
	
	private String contractNumber;
	private String billingMethod;
	private Date commencementDate;
	
	private String contractStatus;
	
	private Client firstOwner;
	private Client secondOwner;
	
	private Client firstLifeAssured;
	private Client secondLifeAssured;
	
	private Product product;

	public void setBillingMethod(String billingMethod) {
		this.billingMethod = billingMethod;
	}

	public String getBillingMethod() {
		return billingMethod;
	}

	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}

	public String getContractNumber() {
		return contractNumber;
	}

	public void setCommencementDate(Date commencementDate) {
		this.commencementDate = commencementDate;
	}

	public Date getCommencementDate() {
		return commencementDate;
	}

	public void setFirstOwner(Client firstOwner) {
		this.firstOwner = firstOwner;
	}

	public Client getFirstOwner() {
		return firstOwner;
	}

	public void setSecondOwner(Client secondOwner) {
		this.secondOwner = secondOwner;
	}

	public Client getSecondOwner() {
		return secondOwner;
	}

	public void setSecondLifeAssured(Client secondLifeAssured) {
		this.secondLifeAssured = secondLifeAssured;
	}

	public Client getSecondLifeAssured() {
		return secondLifeAssured;
	}

	public void setFirstLifeAssured(Client firstLifeAssured) {
		this.firstLifeAssured = firstLifeAssured;
	}

	public Client getFirstLifeAssured() {
		return firstLifeAssured;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Product getProduct() {
		return product;
	}

	public String getContractStatus() {
		return contractStatus;
	}
	

}
