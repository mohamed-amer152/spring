package com.luv2code.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;

public class AfterThrowingMainDemo {

	
	public static void main(String args [])
	{
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		// notive the first litter of the bean name i have to convert to lower case if it was not
		AccountDAO accountdao = context.getBean("acoountDAO",AccountDAO.class);
		
		try {
			accountdao.AddAccount(true);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		context.close();
	}
}
