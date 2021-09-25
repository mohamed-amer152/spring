package com.luv2code.springdemo.springjpademo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springdemo.springjpademo.entiy.Employee;
import com.luv2code.springdemo.springjpademo.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	private EmployeeService employeeService ;
	@Autowired
	public EmployeeController(EmployeeService es) {
		employeeService =es ;
	}
	
	// find all customers 
	@GetMapping("/employees")
	public List<Employee> findall()
	{
		return employeeService.getEmployees() ;
	}
	
	// find single customer 
	@GetMapping("/employees/{id}")
	public Employee find(@PathVariable int id)
	{
		return employeeService.getEmployee(id) ;
	}
	
	// save one customer
	@PostMapping("/employees")
	public Employee save(@RequestBody Employee employee)
	{
		employee.setId(0);
		employeeService.save(employee) ;
		return employee ;
	}
	
	// update an existing customer
	@PutMapping("/employees")
	public Employee update(@RequestBody Employee employee)
	{
		
		employeeService.save(employee) ;
		return employee ;
	}
	
	// delete an existing customer
	
	@DeleteMapping("/employees/{id}")
	public String delete(@PathVariable int id )
	{
		employeeService.delete(id);
		return "customer is succesfully deleted with id : " + id ;
	}

}








