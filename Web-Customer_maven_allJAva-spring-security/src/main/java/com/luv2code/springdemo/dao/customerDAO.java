package com.luv2code.springdemo.dao;

import java.util.List;

import com.luv2code.springdemo.entity.customer;

public interface customerDAO {
	
	public List<customer> gitcustomer();

	public void savecustomer(customer cust);

	public customer getcustomer(int studentid);

	public void deletecustomer(int sid);

	public List<customer> search(String key); 

}
