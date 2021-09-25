package com.spring.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.spring.hibernate.entity.instructor;
import com.spring.hibernate.entity.instructor_detail;

public class creatDemo {

	public static void main(String[] args) {


		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(instructor_detail.class)
				.addAnnotatedClass(instructor.class).buildSessionFactory();
		
		
		Session session = factory.getCurrentSession();
		
		try {
		
			instructor tempinstructor = new instructor("mohamed", "Amer","rezk25@gmail.com");
			instructor_detail tempinstructor_detail = new instructor_detail("rezk@youtub","coder");
			tempinstructor.setInstructor_detail_id(tempinstructor_detail);
			
			session.beginTransaction();
			session.save(tempinstructor);
			session.getTransaction().commit();
			
		} finally {
			factory.close();
		}
		
		
		
		
		
	}

}
