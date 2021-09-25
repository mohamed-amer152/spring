package com.luv2code.springdemo.springjpademo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.luv2code.springdemo.springjpademo.entiy.Employee;
@Repository
public class EmployeeDAOimpl implements EmployeeDAO {

 
	private EntityManager manager ;
	@Autowired
	public EmployeeDAOimpl(EntityManager em) {
		
	    manager = em ;
	}

	@Override
	public List<Employee> getEmployees() {

		Session session = manager.unwrap(Session.class);
		
		Query<Employee> myquery = session.createQuery("from Employee",Employee.class);
		List<Employee> list = myquery.getResultList();
		return list;
	}

	@Override
	public Employee getEmployee(int id) {

		Session session = manager.unwrap(Session.class);
		Employee employee = session.get(Employee.class, id);
		return employee;
	}

	@Override
	public void save(Employee employee) {

		Session session = manager.unwrap(Session.class);
		session.saveOrUpdate(employee);
		//employee.setId(0);
	}

	

	@Override
	public void delete(int EmployeeId) {
 
		Session session = manager.unwrap(Session.class);
		Query myquery = session.createQuery("delete from Employee where id =:emid");
		myquery.setParameter("emid", EmployeeId);
		myquery.executeUpdate();
		
	}

}
















