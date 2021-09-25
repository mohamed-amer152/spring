package com.spring.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.spring.hibernate.entity.Courses;
import com.spring.hibernate.entity.Reviews;
import com.spring.hibernate.entity.instructor;
import com.spring.hibernate.entity.instructor_detail;

public class createCourseReviewsdemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(instructor_detail.class)
				.addAnnotatedClass(instructor.class)
				.addAnnotatedClass(Reviews.class)
				.addAnnotatedClass(Courses.class).buildSessionFactory();
		
		
		Session session = factory.getCurrentSession();
		try {
		
			
			session.beginTransaction();
		//	Courses coursetemp = session.get(Courses.class, 29);
			Courses coursetemp = new Courses("yaaaaaaaaaaaaaa");
			Reviews r1 =new Reviews("nice course");
			Reviews r2 =new Reviews("very  varey   nice course");

			//
			coursetemp.addreviews(r1);
			coursetemp.addreviews(r2);
			//
			System.out.println("\n\n" + "inserting data ");
			System.out.println("\n\n" + coursetemp);
			System.out.println("\n\n");
			session.save(coursetemp);
			
			
			//session.delete(session.get(Courses.class , 14));
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
