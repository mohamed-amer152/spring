package com.spring.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.spring.hibernate.entity.instructor;
import com.spring.hibernate.entity.instructor_detail;

public class readdemo {

	public static void main(String[] args) {


		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(instructor_detail.class)
				.addAnnotatedClass(instructor.class).buildSessionFactory();
		
		
		Session session = factory.getCurrentSession();
		
		try {
			session.beginTransaction();

			int id =1 ;
			instructor_detail tempinstructor_detail = session.get(instructor_detail.class, id);
			System.out.println("\n\n\n"+tempinstructor_detail);
			System.out.println("\n\n\n"+tempinstructor_detail.getMyinstrctor());
			session.getTransaction().commit();
			
		} finally {
			factory.close();
		}
		
		
		
		
		
	}

}
