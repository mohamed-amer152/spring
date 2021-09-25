package com.spring.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.spring.hibernate.entity.Courses;
import com.spring.hibernate.entity.Reviews;
import com.spring.hibernate.entity.Student;
import com.spring.hibernate.entity.instructor;
import com.spring.hibernate.entity.instructor_detail;

public class createCourseStudentdemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(instructor_detail.class)
				.addAnnotatedClass(instructor.class)
				.addAnnotatedClass(Reviews.class)
				.addAnnotatedClass(Student.class)
				.addAnnotatedClass(Courses.class).buildSessionFactory();
		
		
		Session session = factory.getCurrentSession();
		try {
		
			
			session.beginTransaction();
			
			/*
			session.delete(session.get(Student.class, 2));
			//crate courses
			Courses coursetemp = new Courses("arabic");
			//save the courses 
			session.save(coursetemp);
			
			 //create students 
			Student tempstudent1 = new Student("mohamed ", "amer", "amer@luv2code.com");
			Student tempstudent2 = new Student("ahmed  ", "rezk", "amer@luv2code.com");
			
			
			// adding the students to the courss 
			coursetemp.addstudent(tempstudent2);
			coursetemp.addstudent(tempstudent1);
		
			
			// saving the courcses
			session.save(tempstudent1);
			session.save(tempstudent2);
			*/
			
			
			
			/*
			//---add courses to studens 
			Courses tempcourse1 = session.get(Courses.class, 12);
			Courses tempcourse2 = session.get(Courses.class, 13);
			Student tempstudentStudent = session.get(Student.class, 7);
			tempstudentStudent.addCourses(tempcourse2);
			tempstudentStudent.addCourses(tempcourse1);
			
			session.save(tempstudentStudent);
			
			
			*/
			
			
			
			// add student to courses   
			Courses tempcourse1 = session.get(Courses.class, 13);
			Student tempstudent2 = session.get(Student.class, 8);
			tempcourse1.addstudent(tempstudent2);
			session.save(tempcourse1);
			
			
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
