package com.luv2code.springDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaconfigMain {

	public static void main(String[] args) {


		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		//Coach theCoach = context.getBean("tenniesCoach",Coach.class);
		swimCoach theCoach = context.getBean("swimming",swimCoach.class);

		System.out.println(theCoach.getDailyWork());
		System.out.println(theCoach.getfortune());
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getName());
		
		context.close();
	}

}
