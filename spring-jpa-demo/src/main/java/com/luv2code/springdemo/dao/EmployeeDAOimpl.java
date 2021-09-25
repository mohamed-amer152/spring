package com.luv2code.springdemo.dao;

import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.Employee;

@Repository
public class EmployeeDAOimpl implements EmployeeDAO {

    private Logger log = Logger.getLogger(getClass().getName());
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
		log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+list);
		return list;
	}

	@Override
	public Employee getEmployee(int id) {

		Session session = manager.unwrap(Session.class);
		Query<Employee> myquery = session.createQuery("from employee where employee.id =:emid",Employee.class);
		myquery.setParameter("emid", id);
		
		return myquery.getSingleResult();
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
		Query<Employee> myquery = session.createQuery("delete from employee where employee.id =:emid",Employee.class);
		myquery.setParameter("emid", EmployeeId);
		myquery.executeUpdate();
		
	}

}
















