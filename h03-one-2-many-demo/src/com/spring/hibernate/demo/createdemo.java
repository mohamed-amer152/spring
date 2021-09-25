package com.spring.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.spring.hibernate.entity.instructor;
import com.spring.hibernate.entity.instructor_detail;

public class createdemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(instructor_detail.class)
				.addAnnotatedClass(instructor.class).buildSessionFactory();
		
		
		Session session = factory.getCurrentSession();
		
		try {
		
			instructor tempinstructor = new instructor("jon", "doe","rezk25@gmail.com");
			instructor_detail tempinstructor_detail = new instructor_detail("deo@youtub","coder");
			tempinstructor.setInstructor_detail_id(tempinstructor_detail);
			
			session.beginTransaction();
			
			session.save(tempinstructor);
			
			session.getTransaction().commit();
			
		} 
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			session.close();
			factory.close();
		}
		
		
		
		
		
	}

}
