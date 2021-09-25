package com.luv2code.springdemo.springjpademo.service;

import java.util.List;

import com.luv2code.springdemo.springjpademo.entiy.Employee;

public interface EmployeeService {

	// get employees
		public List<Employee> getEmployees();
		//get single employee 
		public Employee getEmployee(int id);
		// save employee
		public void save(Employee employee);
		
		// delete employee 
		public void delete(int EmployeeId);

	
	
}
