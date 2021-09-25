package com.luv2code.springdemo.services;

import java.util.List;

import com.luv2code.springdemo.entity.customer;

public interface customerService {
	
	public List<customer> customerlist () ;

	public void savecustomer(customer cust);

	public customer getcustomer(int studentid);

	public void deletecustomer(int sid);

	public List<customer> search(String key);

}
