package com.luv2code.springdemo.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.Employee;

@Repository
public class EmployeeDAOimpl implements EmployeeDAO {

    
	private EntityManager manager ;
	@Autowired
	public EmployeeDAOimpl(EntityManager em) {
		
	    manager = em ;
	}

	@Override
	public List<Employee> getEmployees() {

		
		Query myquery = manager.createQuery("from Employee",Employee.class);
		List<Employee> list = myquery.getResultList();
		
		return list;
	}

	@Override
	public Employee getEmployee(int id) {


		Employee emp = manager.find(Employee.class, id);
		
		return emp;
	}

	@Override
	public void save(Employee employee) {
 
		Employee emp = manager.merge(employee);
		employee.setId(emp.getId());
	}

	

	@Override
	public void delete(int EmployeeId) {
  
		Query myquery = manager.createQuery("delete from employee where employee.id =:emid");
		myquery.setParameter("emid", EmployeeId);
		myquery.executeUpdate();
		
	}

}
















