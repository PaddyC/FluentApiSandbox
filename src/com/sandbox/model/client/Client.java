package com.sandbox.model.client;

import java.sql.Date;


public class Client {
	
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	
	private ClientType clientType;
	
	private ClientRole clientRole;
	
	
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setClientType(ClientType clientType) {
		this.clientType = clientType;
	}
	public ClientType getClientType() {
		return clientType;
	}
	public void setClientRole(ClientRole clientRole) {
		this.clientRole = clientRole;
	}
	public ClientRole getClientRole() {
		return clientRole;
	}
	

}
