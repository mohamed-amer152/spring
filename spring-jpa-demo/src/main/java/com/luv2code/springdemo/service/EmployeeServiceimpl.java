package com.luv2code.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.dao.EmployeeDAO;
import com.luv2code.springdemo.entity.Employee;

@Service
public class EmployeeServiceimpl implements EmployeeService {

	private EmployeeDAO employeedao ;
	
	@Autowired
	public EmployeeServiceimpl(EmployeeDAO edao) {
		employeedao = edao ;
	}

	@Override
	@Transactional
	public List<Employee> getEmployees() {
		
		return employeedao.getEmployees();
	}

	@Override
	@Transactional
	public Employee getEmployee(int id) {
		return employeedao.getEmployee(id);
	}

	@Override
	@Transactional
	public void save(Employee employee) {
		employeedao.save(employee);
	}

	@Override
	@Transactional
	public void delete(int EmployeeId) {
		employeedao.delete(EmployeeId);
	}

}
