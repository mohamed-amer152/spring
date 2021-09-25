package com.luv2code.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.entity.customer;


// that repository only applied to the DAO implementatoin clases 
// to  1- enabel the spring from componenet scanning 
// to  2- translat the hibernate Exceptions for us 
@Repository
public class customerDAOimpl implements customerDAO {

	//create session factory 
	@Autowired
	private SessionFactory sessionFactory ;
	
	

	@Override
	public List<customer> gitcustomer() {
		

		// create session 
		Session session = sessionFactory.getCurrentSession();
		
		//create query  
		Query<customer> myquery = 
				session.createQuery("from customer" , customer.class);
		
		// execute query 
		List<customer> customers = myquery.getResultList();
		return customers ;
				
	}



	@Override
	public void savecustomer(customer cust) {
      
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(cust);
	}



	@Override
	
	public customer getcustomer(int studentid) {

		Session session = sessionFactory.getCurrentSession();
//		Query<customer> myquery = session.createQuery("from customer where customer.id =:studentID" );
//		myquery.setParameter("studentID", studentid);
//		
		customer cust = session.get(customer.class, studentid);
		return cust;
	}



	@Override

	public void deletecustomer(int sid) {

		System.out.println(sid);
		Session session = sessionFactory.getCurrentSession();
		customer cust = session.get(customer.class ,sid);
		session.delete(cust);
	}



	@Override
	public List<customer> search(String key) {

         Session session = sessionFactory.getCurrentSession();
		
         Query<customer> myquery = session.createQuery(" from customer where first_name =:name");
		 myquery.setParameter("name", key);
		 
		 List<customer> customerlist = myquery.getResultList();
		 
			 return customerlist;
		
		
	}

	
	
}
