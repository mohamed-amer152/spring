package com.luv2code.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanlifeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("BeanlifeapplicationContext2.xml");
		
		Coach myCoach = context.getBean("myCoach",Coach.class);
		System.out.println(myCoach.getdaily());
		context.close();
		

	}

}
