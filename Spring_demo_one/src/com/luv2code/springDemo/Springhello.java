package com.luv2code.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Springhello {

	public static void main(String[] args) {


		//load the spring configurtion file
		ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext("applicationContext.xml");
		//retrive the beans from spring container
		Coach theone = context.getBean("mytrackcoach" , Coach.class);
		// use the beans methos
		System.out.println(theone.getdaily());
		
		// close the container
		
		context.close();
		
		System.out.println(theone.getDailyfortion());
		
		
	}

}
