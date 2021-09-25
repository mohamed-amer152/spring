package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MemberShipdao {
	
	public String Addmember(String name)
	{
		System.out.println("\n ========> inside member ship AddAcount <========");
		
		return "";
	}
	
	public String refusing()
	{
		System.out.println("\n ========> inside member ship  refusing method <========");
		
		return "";
	}

	
	
	public void calulat()
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("\n inside calculate methode ....... ");
	}
	
	
	
	
}
