package com.luv2code.springdemo.rest;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.service.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerRestController {
	@Autowired
	private CustomerService customerService ;
	
	
	// getting all customers 
	@GetMapping("/customers")
	public List<Customer> getcustomers()
	{
		List<Customer> list = customerService.getCustomers();
		return list;
	}
	
	// getting single customer
	@GetMapping("/customers/{id}")
	public Customer  getcustomer(@PathVariable int id)
	{

		Customer customer = customerService.getCustomer(id);
		if (customer == null) {
			throw new CustomException();
		}
		return customer;
	}
	
	
	@PostMapping("/customers")
	public Customer save(@RequestBody Customer cust)
	{
		// coze our saving methode in the dao is method for save or update 
		// so if we set the id into 0 this mean it is null 
		// so the methode will be forced to enter it as new entry 
		cust.setId(0);
		customerService.saveCustomer(cust);
		return cust ;
	}
	
	
	@PutMapping("/customers")
	public Customer update(@RequestBody Customer cust)
	{
		// coze our saving methode in the dao is method for save or update 
		// so if we set the id into 0 this mean it is null 
		// so the methode will be forced to enter it as new entry 
		
		customerService.saveCustomer(cust);
		return cust ;
	}
	
	@DeleteMapping("/customers/{id}")
	public String delete(@PathVariable int id )
	{
		if (customerService.getCustomer(id) == null) {
			throw new CustomException();
		}
		customerService.deleteCustomer(id);
		return "customer deleted with id : " + id ;
	}
	
	
	
	
	
	
	
	
	
	
	

}
