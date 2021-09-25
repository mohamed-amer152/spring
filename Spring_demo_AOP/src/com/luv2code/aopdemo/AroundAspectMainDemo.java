package com.luv2code.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.MemberShipdao;

public class AroundAspectMainDemo {

	public static void main(String[] args) {


		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		
		MemberShipdao member = context.getBean("memberShipdao" , MemberShipdao.class);
		
		member.calulat();
		
		context.close();
		
		System.out.println("Main finished ");
		
		
	}

}
