package com.luv2code.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class setterMain {

	public static void main(String[] args) {


		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		criket thecoch = context.getBean("mykrect",criket.class);
		
		System.out.println(thecoch.getdaily());
		System.out.println(thecoch.getDailyfortion());
		System.out.println(thecoch.getTeam());
		System.out.println(thecoch.getEmail());
		context.close();
		
	}

}
