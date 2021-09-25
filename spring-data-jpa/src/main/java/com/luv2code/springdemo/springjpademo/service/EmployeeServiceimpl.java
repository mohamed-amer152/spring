package com.luv2code.springdemo.springjpademo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.springjpademo.dao.EmployeeDAO;
import com.luv2code.springdemo.springjpademo.entiy.Employee;

@Service
public class EmployeeServiceimpl implements EmployeeService {

	private EmployeeDAO employeedao ;
	
	@Autowired
	public EmployeeServiceimpl(EmployeeDAO edao) {
		employeedao = edao ;
	}

	@Override
	public List<Employee> getEmployees() {
		
		return employeedao.findAll();
	}

	@Override
	public Employee getEmployee(int id) {
		 Optional<Employee> findById = employeedao.findById(id);
		 Employee empl ;
		 if (findById.isPresent()) {
			empl = findById.get();
		} else {
           throw new RuntimeException("id not found   ------");
		}
		 
		 return empl ;
	}

	@Override
	public void save(Employee employee) {
		employeedao.save(employee);
	}

	@Override
	public void delete(int EmployeeId) {
		
		 Optional<Employee> findById = employeedao.findById(EmployeeId);
		 
		 if (findById.isPresent()) {
			 employeedao.deleteById(EmployeeId);
		} else {
           throw new RuntimeException("id not found   ------");
		}
	}

}
