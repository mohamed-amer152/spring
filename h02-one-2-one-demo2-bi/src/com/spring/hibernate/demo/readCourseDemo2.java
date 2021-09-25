package com.spring.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.spring.hibernate.entity.Courses;
import com.spring.hibernate.entity.instructor;
import com.spring.hibernate.entity.instructor_detail;

public class readCourseDemo2 {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(instructor_detail.class)
				.addAnnotatedClass(instructor.class)
				.addAnnotatedClass(Courses.class).buildSessionFactory();
		
		
		Session session = factory.getCurrentSession();
		
		try {
		
			session.beginTransaction();
			
			int id = 1 ;
			instructor myinster = session.get(instructor.class, id);

			System.out.println("\n\nthe courses\n\n" + myinster.getCourslist());
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
