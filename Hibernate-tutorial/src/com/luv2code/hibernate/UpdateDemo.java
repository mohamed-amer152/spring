package com.luv2code.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2codew.hibernate.demo.entity.student;

public class UpdateDemo {

	public static void main(String[] args) {


		// createsession factory 
		
		SessionFactory factory = new Configuration().configure().
				addAnnotatedClass(student.class).buildSessionFactory();
		// creaste sesson
		Session session = factory.getCurrentSession();
		try {
			// start transaction
			session.beginTransaction();
			int studentId = 1 ;
			student stud = session.get(student.class, studentId);
			stud.setFirst_name("basyouny ");
			
			// upbdating using query incase of updating more than one object or even one object
			session = factory.getCurrentSession();
			session.beginTransaction();
			session.createQuery("update student set email ='rezk2562@gmaail.com'").executeUpdate();
			
			session.getTransaction().commit();
			
		} finally {


			factory.close();
		}
		
		
		
	}

}
