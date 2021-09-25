package com.luv2code.hibernate;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2codew.hibernate.demo.entity.student;

public class readStudentSDemo {

	public static void main(String[] args) {


		SessionFactory factory = new Configuration().
				configure().addAnnotatedClass(student.class).buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		try {
			
			

			// read single object 
			/*
			session.beginTransaction();
			student stud = session.get(student.class, 1);
			session.getTransaction().commit();
		    System.out.println("\n  session successfully craeted " + stud.getEmail());

			*/
			
			
			// read list of objects 
			
			session.beginTransaction();
			List<student> studentlist = session.createQuery("from student s ").getResultList();
			
			// displaying the list 
			display(studentlist);
			
			// retriving stdents with specific conditoins 
			studentlist = session.createQuery("from student s where s.last_name ='amer'").getResultList();
			
			// display 
			display(studentlist) ;
			/////
			session.getTransaction().commit();
		} finally {
			
			factory.close();
		}
		
		
		
		
		
		
	}

	private static void display(List<student> studentlist) {
		for (student temp : studentlist) {

		    System.out.println("\n\n" + temp.getFirst_name() + "  "+temp.getEmail());
		}
	}

}
