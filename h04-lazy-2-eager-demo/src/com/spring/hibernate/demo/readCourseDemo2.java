package com.spring.hibernate.demo;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

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
			// 1- option 1 for using the lazy data after closing the session 
			/*
			System.out.println("\n\n  courses\n\n" + myinster.getCourslist());
             */
			Query<instructor> query = session.createQuery("select i from instructor i "
					+ "join fetch i.courslist where i.id=:id",instructor.class);
			
			query.setParameter("id", id);
			
			instructor ins = query.getSingleResult();
			
			session.getTransaction().commit();                                                                                   
			session.close();
			
			// scince the courses are a lazy data so it canot accessed after closing the session normally 
			System.out.println("\n\n after session closedthe courses\n\n" + ins.getCourslist());

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
