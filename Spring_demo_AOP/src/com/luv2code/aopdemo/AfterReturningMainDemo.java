package com.luv2code.aopdemo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.Account;
import com.luv2code.aopdemo.dao.AccountDAO;

public class AfterReturningMainDemo {

	public static void main(String[] args) {


		// define the config 
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		// get the spring beans inside the container 
		AccountDAO accountdao = context.getBean(AccountDAO.class);
		
		// apply the bussinse logic inside the bean
		List<Account> accounts = accountdao.findAccount();
		System.out.println("\nthe main method result : ");
		System.out.println(accounts);

		// close the context 
		context.close();
		
	}

}
