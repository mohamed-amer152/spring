package com.luv2code.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// define the Application container xml 
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		// retrive the beans from the container 
		Coach theCoach = context.getBean("tenniesCoach" , Coach.class);
		// call the methodes inside the beans 
		System.out.println(theCoach.getDailyWork());
		System.out.println(theCoach.getfortune());
		// close the context 
		
		

	}

}



