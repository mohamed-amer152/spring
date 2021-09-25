package com.luv2code.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class arrayActivity {

	public static void main(String[] args) {


		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach thecaptin = context.getBean("myCoach" , Coach.class);
		
		System.out.println(thecaptin.getdaily());
		System.out.println(thecaptin.getDailyfortion());
		context.close();
	}

}
