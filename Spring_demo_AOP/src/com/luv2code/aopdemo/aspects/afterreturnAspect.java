package com.luv2code.aopdemo.aspects;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.dao.Account;

@Aspect
@Component
public class afterreturnAspect {
	
	/*
	 *  after returning advise is applied after 
	 *  the success execution of the method and before
	 *  returning the result
	 */
	
	@AfterReturning(pointcut = "execution(* com.luv2code.aopdemo.dao.AccountDAO.findAccount(..))",
			        returning = "result")
	public void dowork(JoinPoint join , List<Account> result)
	{
		System.out.println("\ninside @afterReturning Aspect");
		System.out.println("\nthe target method signture : "+join.getSignature());
		System.out.println("\nthe result : "+result);
		
		// here we can add or modify on the returning result that 
		// going as a response ''''''''
		List<Account> mywork = result ;
		mywork.clear();

	}

}
