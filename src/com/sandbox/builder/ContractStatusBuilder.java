package com.sandbox.builder;

import com.sandbox.model.contractstatus.ContractStatus;
import com.sandbox.model.contractstatus.ContractStatusTypes;

public class ContractStatusBuilder {
	
	private ContractStatus contractStatus;
	
	public static ContractStatusBuilder create() {
		return new ContractStatusBuilder();
	}
	
	private ContractStatusBuilder() {
		this.contractStatus = new ContractStatus();
	}
	
	public ContractStatusBuilder withType(String contractStatusType) {
		ContractStatusTypes statusType = Enum.valueOf(ContractStatusTypes.class, contractStatusType);
		contractStatus.setStatusCode(statusType.getType());
		contractStatus.setStatusDescription(statusType.getDescription());
		return this;
	}
	
	public ContractStatus build() {
		return contractStatus;
	}

}
