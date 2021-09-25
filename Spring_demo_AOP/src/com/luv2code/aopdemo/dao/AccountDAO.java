package com.luv2code.aopdemo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

// the target object

@Component
public class AccountDAO {
	
	private String firstName ;
	
	public void AddAccount(boolean flag)
	{
		System.out.println("\n----------->> inside dao ACCount addacount<<---------------");
		if (flag) {
			String message = "oops you have an exception in the method";
			throw new RuntimeException(message) ;
			
		}
		
	}

	
	
	public void playing()
	{
		System.out.println("\n----------->> inside dao ACCount playing method <<---------");
	}



	public String getFirstName() {
		System.out.println("\n----------->> inside dao ACCount getter  method <<---------");

		return firstName;
	}



	public void setFirstName(String firstName) {
		System.out.println("\n----------->> inside dao ACCount Setter  method <<---------");
		this.firstName = firstName;
	}
	
	
	public List<Account> findAccount()
	{
		List<Account> list = new ArrayList<Account>();
		Account account1 = new Account("mohamed", "1");
		Account account2 = new Account("Amer", "0");
		Account account3 = new Account("rezk", "2");
        list.add(account1);
        list.add(account2);
        list.add(account3);
		
		return list;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
