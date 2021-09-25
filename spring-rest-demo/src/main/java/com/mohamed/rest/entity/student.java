package com.mohamed.rest.entity;

public class student {
	
	private String FirstName ;
	private String LastName ;
	
	public student () {}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public student(String firstName, String lastName) {
		FirstName = firstName;
		LastName = lastName;
	}
	
	

}
