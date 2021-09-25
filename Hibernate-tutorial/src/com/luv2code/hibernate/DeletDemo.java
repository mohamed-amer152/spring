package com.luv2code.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2codew.hibernate.demo.entity.student;

public class DeletDemo {

	public static void main(String[] args) {


		// createsession factory 
		
				SessionFactory factory = new Configuration().configure().
						addAnnotatedClass(student.class).buildSessionFactory();
				// creaste sesson
				Session session = factory.getCurrentSession();
				try {
					// start transaction
					session.beginTransaction();
					// delete using the direct method session.delete
					int studentId = 1 ;
					student stud = session.get(student.class, studentId);
					session.delete(stud);
					session.getTransaction().commit();
					// deleteing using query
					session = factory.getCurrentSession();
					session.beginTransaction();
					session.createQuery("delete from student where first_name ='shneg'").executeUpdate();
					session.getTransaction().commit();
					
				} finally {


					factory.close();
				}
				
				
		
		
	}

}
