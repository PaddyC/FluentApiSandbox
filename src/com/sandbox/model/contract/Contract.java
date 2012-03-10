package com.sandbox.model.contract;

import java.sql.Date;

import com.sandbox.model.billing.BillingMethod;
import com.sandbox.model.client.Client;
import com.sandbox.model.contractstatus.ContractStatus;
import com.sandbox.model.product.Product;

public class Contract {
	
	private String contractNumber;
	private Date commencementDate;
	
	private Product product;
	
	private ContractStatus contractStatus;
	
	private Client[] contractOwners;
	private Client[] livesAssured;
	
	private BillingMethod billingMethod;
	
	public Contract() {
	}
	
	public Contract(String contractNumber, Date commencementDate, Product product, 
			ContractStatus contractStatus, Client[] owners, Client[] livesAssured, BillingMethod billingMethod) {
		
		this.contractNumber = contractNumber;
		this.commencementDate = commencementDate;
		this.product = product;
		this.contractStatus = contractStatus;
		this.contractOwners = owners;
		this.livesAssured = livesAssured;
		this.billingMethod = billingMethod;
		
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
	public void setProduct(Product product) {
		this.product = product;
	}
	public Product getProduct() {
		return product;
	}
	public void setContractStatus(ContractStatus contractStatus) {
		this.contractStatus = contractStatus;
	}
	public ContractStatus getContractStatus() {
		return contractStatus;
	}
	
	public void setBillingMethod(BillingMethod billingMethod) {
		this.billingMethod = billingMethod;
	}
	public BillingMethod getBillingMethod() {
		return billingMethod;
	}
	public void setContractOwners(Client[] contractOwners) {
		this.contractOwners = contractOwners;
	}
	public Client[] getContractOwners() {
		return contractOwners;
	}
	public void setLivesAssured(Client[] livesAssured) {
		this.livesAssured = livesAssured;
	}
	public Client[] getLivesAssured() {
		return livesAssured;
	}

}
