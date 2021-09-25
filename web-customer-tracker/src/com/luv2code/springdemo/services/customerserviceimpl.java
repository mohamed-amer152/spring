package com.luv2code.springdemo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.dao.customerDAO;
import com.luv2code.springdemo.entity.customer;
@Service
public class customerserviceimpl implements customerService {
	
	// create depndecy ingection for the dao 
	@Autowired
	private customerDAO customerdao ;

	// add the transactoinal manager
	@Override
	@Transactional
	public List<customer> customerlist() {
 
		// get the customer list from dao 
		List<customer> custolist = customerdao.gitcustomer();
		//return th list
		return custolist;
	}

	@Override
	@Transactional
	public void savecustomer(customer cust) {

		customerdao.savecustomer(cust);
		
	}

	@Override
	public customer getcustomer(int studentid) {
		
		customer cusst = customerdao.getcustomer(studentid);
		return cusst;
	}

	@Override
	public void deletecustomer(int sid) {

             customerdao.deletecustomer(sid);		
	}

	@Override
	@Transactional
	public List<customer> search(String key) {

		List<customer> cust = customerdao.search(key);
		return cust;
	}

}
