package com.sandbox.model.product;

import java.math.BigDecimal;

public class BasisOfCover {
	
	private boolean singleLife;
	private boolean jointLife;
	private boolean dualLife;
	
	private BigDecimal sumAssured;
	private Integer term;
	
	public void setSingleLife(boolean singleLife) {
		this.singleLife = singleLife;
	}
	public boolean isSingleLife() {
		return singleLife;
	}
	public void setJointLife(boolean jointLife) {
		this.jointLife = jointLife;
	}
	public boolean isJointLife() {
		return jointLife;
	}
	public void setDualLife(boolean dualLife) {
		this.dualLife = dualLife;
	}
	public boolean isDualLife() {
		return dualLife;
	}
	public void setSumAssured(BigDecimal sumAssured) {
		this.sumAssured = sumAssured;
	}
	public BigDecimal getSumAssured() {
		return sumAssured;
	}
	public void setTerm(Integer term) {
		this.term = term;
	}
	public Integer getTerm() {
		return term;
	}

}
