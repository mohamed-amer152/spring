package com.luv2code.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.Account;
import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.dao.MemberShipdao;

public class MainDemoApp {

	public static void main(String[] args) {


		// read the spring configuration class 
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		// get the bean insidede 
		AccountDAO accountdao = context.getBean(AccountDAO.class);
		MemberShipdao member = context.getBean(MemberShipdao.class);
		// call the dao method 
		Account account = new Account("Amer", "Gold");
		try {
			//accountdao.AddAccount(account , false);
		} catch (Exception e) {
			e.printStackTrace();
		}
		accountdao.playing();
		accountdao.setFirstName("name");
		accountdao.getFirstName();
		
		
		member.Addmember("");
		member.refusing();
		// close the context
		
		context.close();
		
	}

}
