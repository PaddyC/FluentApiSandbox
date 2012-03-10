package com.sandbox.builder;

import java.sql.Date;

import com.sandbox.model.billing.BillingMethod;
import com.sandbox.model.client.Client;
import com.sandbox.model.contract.Contract;
import com.sandbox.model.contractstatus.ContractStatus;

public class ContractBuilder {
	
	private Contract contract;
	
	public static ContractBuilder create() {
		return new ContractBuilder();
	}
	
	private ContractBuilder() {
		this.contract = new Contract();
	}
	
	public ContractBuilder withContractNumber(String contractNumber) {
		contract.setContractNumber(contractNumber);
		return this;
	}
	
	public ContractBuilder withBillingMethod(BillingMethod billingMethod) {
		contract.setBillingMethod(billingMethod);
		return this;
	}
	
	public ContractBuilder withOwners(Client[] contractOwners) {
		contract.setContractOwners(contractOwners);
		return this;
	}
	
	public ContractBuilder withLivesAssured(Client[] livesAssured) {
		contract.setLivesAssured(livesAssured);
		return this;
	}
	
	public ContractBuilder withCommencementDate(Date commencementDate) {
		contract.setCommencementDate(commencementDate);
		return this;
	}
	
	public ContractBuilder withStatus(ContractStatus status) {
		contract.setContractStatus(status);
		return this;
	}
	
	
	public Contract build() {
		return contract;
	}
	
	

}
