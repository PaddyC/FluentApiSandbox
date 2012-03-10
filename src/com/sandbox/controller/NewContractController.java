package com.sandbox.controller;

import com.sandbox.builder.BillingMethodBuilder;
import com.sandbox.builder.ContractBuilder;
import com.sandbox.builder.ContractStatusBuilder;
import com.sandbox.form.NewContractForm;
import com.sandbox.model.billing.BillingMethod;
import com.sandbox.model.billing.BillingMethodTypes;
import com.sandbox.model.client.Client;
import com.sandbox.model.contract.Contract;
import com.sandbox.model.contractstatus.ContractStatus;
import com.sandbox.model.contractstatus.ContractStatusTypes;

public class NewContractController {
	
	public Contract createNewContract(NewContractForm form) {
		
		Contract contract = new Contract();
		
		contract.setContractNumber(form.getContractNumber());
		contract.setCommencementDate(form.getCommencementDate());
		
		Client[] contractOwners = new Client[]{form.getFirstOwner(), form.getSecondOwner()};
		contract.setContractOwners(contractOwners);
		Client[] livesAssured = new Client[]{form.getFirstLifeAssured(), form.getSecondLifeAssured()};
		contract.setLivesAssured(livesAssured);
		
		contract.setProduct(form.getProduct());
		
		ContractStatusTypes contractStatusType = Enum.valueOf(ContractStatusTypes.class, form.getContractStatus());
		ContractStatus contractStatus = new ContractStatus(contractStatusType);
		contract.setContractStatus(contractStatus);
		
		BillingMethodTypes thisBillingMethodType = Enum.valueOf(BillingMethodTypes.class, form.getBillingMethod());
		BillingMethod billingMethod = new BillingMethod(thisBillingMethodType);
		contract.setBillingMethod(billingMethod);
		
		return new Contract();
		
	}

	
	public Contract secondCreateNewContract(NewContractForm form) {
		
		Contract contract = new Contract();
		contract.setContractNumber(form.getContractNumber());
		contract.setCommencementDate(form.getCommencementDate());
		contract.setContractOwners(getOwners(form));
		contract.setLivesAssured(getLivesAssured(form));
		contract.setProduct(form.getProduct());
		
		BillingMethod billingMethod = BillingMethodBuilder.create()
			.withType(form.getBillingMethod()).build();
		contract.setBillingMethod(billingMethod);
		
		ContractStatus contractStatus = ContractStatusBuilder.create()
			.withType(form.getContractStatus()).build();
		contract.setContractStatus(contractStatus);
		
		return contract;
	}
	
	public Contract fourthCreateNewContract(NewContractForm form) {
		
		Contract contract = new Contract();
		contract.setContractNumber(form.getContractNumber());
		contract.setCommencementDate(form.getCommencementDate());
		contract.setContractOwners(getOwners(form));
		contract.setLivesAssured(getLivesAssured(form));		
		contract.setProduct(form.getProduct());
		
		contract.setBillingMethod(getBillingMethod(form));

		contract.setContractStatus(getContractStatus(form));
		
		return contract;
	}
	
	public Contract finalCreateNewContract(NewContractForm form) {
		
		Contract contract = ContractBuilder.create()
			.withContractNumber(form.getContractNumber())
			.withCommencementDate(form.getCommencementDate())
			.withStatus(getContractStatus(form))
			.withOwners(getOwners(form))
			.withLivesAssured(getLivesAssured(form))
			.withBillingMethod(getBillingMethod(form))
			.build();
		
		return contract;		
	}

	private BillingMethod getBillingMethod(NewContractForm form) {
		BillingMethod billingMethod = BillingMethodBuilder.create()
			.withType(form.getBillingMethod()).build();
		return billingMethod;
	}

	private ContractStatus getContractStatus(NewContractForm form) {
		ContractStatus contractStatus = ContractStatusBuilder.create()
			.withType(form.getContractStatus()).build();
		return contractStatus;
	}

	private Client[] getLivesAssured(NewContractForm form) {
		return new Client[]{form.getFirstLifeAssured(), form.getSecondLifeAssured()};
	}

	private Client[] getOwners(NewContractForm form) {
		return new Client[]{form.getFirstOwner(), form.getSecondOwner()};
	}

}