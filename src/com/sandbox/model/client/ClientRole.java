package com.sandbox.model.client;

public class ClientRole {
	
	private String roleName;
	private String roleDescription;
	
	public ClientRole(ClientRoleTypes clientRoleType) {
		this.roleName = clientRoleType.getType();
		this.roleDescription = clientRoleType.getDescription();
	}
	
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}
	public String getRoleDescription() {
		return roleDescription;
	}

}
