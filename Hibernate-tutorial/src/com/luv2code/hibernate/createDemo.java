package com.luv2code.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2codew.hibernate.demo.entity.student;

public class createDemo {

	public static void main(String[] args) {

        // create a session factory 
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml").
				addAnnotatedClass(student.class).
				buildSessionFactory();
		
		
		//create the sessions 
		
		try {
			// create session
			Session mysession = factory.getCurrentSession();
		    System.out.println(" session successfully craeted ");
			// create student object 
			student mystudent = new student("omer", "mohameeeeed", "IbnAmer@luv2code.com");
			//startr the transactoin 
			mysession.beginTransaction();
			// saving the object to the data base 
			mysession.save(mystudent);
			 System.out.println(" object successfully saved ");
			// commit the actoin so it will be consideerd 
			mysession.getTransaction().commit();
			
		} finally {
                   factory.close();
		}
		

	}

}
