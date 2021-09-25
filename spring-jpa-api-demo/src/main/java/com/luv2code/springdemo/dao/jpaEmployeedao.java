package com.luv2code.springdemo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.Employee;

@Repository
public class jpaEmployeedao implements EmployeeDAO {

	public jpaEmployeedao() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Employee employee) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int EmployeeId) {
		// TODO Auto-generated method stub

	}

}
