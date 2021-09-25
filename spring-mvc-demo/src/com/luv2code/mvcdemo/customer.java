package com.luv2code.mvcdemo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import validation.CourceCode;


public class customer {
	
	
	private String firstName ;
	@NotNull(message = "cannot be empty ")
	@Size(min=1 , message = "is required")
	private String lastName ;
	@NotNull(message="cannot be empty ")
	@Min(value = 0 , message="it should be >= 0  ")
	@Max(value = 10 , message = "it should be <= 10")
	private Integer passway ;
	@Pattern(regexp = "^[a-zA-Z0-9]{5}" , message = "its only 5 digits ")
	private String postalcode ;
	@CourceCode
	private String cource ;
	
	

	public String getCource() {
		return cource;
	}

	public void setCource(String cource) {
		this.cource = cource;
	}

	public String getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}

	public Integer getPassway() {
		return passway;
	}

	public void setPassway(Integer passway) {
		this.passway = passway;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
	

}
