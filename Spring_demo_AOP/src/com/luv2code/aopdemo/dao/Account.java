package com.luv2code.aopdemo.dao;

public class Account {
	
	private String firstName ;
	private String level ;
	
	private Account()
	{}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	
	
	
	public Account(String firstName, String level) {
		super();
		this.firstName = firstName;
		this.level = level;
	}

	@Override
	public String toString() {
		return "Account [firstName=" + firstName + ", level=" + level + "]";
	}
	
	

}
