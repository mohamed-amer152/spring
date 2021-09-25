package com.luv2code.aopdemo.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(0)
public class AfterThrowingAspect {
	
	/*
	 * after throwing advises is applied
	 * after the method execution in case of 
	 * only runtime exception happened not compile time exception  
	 */
	
	@AfterThrowing(pointcut = "execution(* com.luv2code.aopdemo.dao.AccountDAO.AddAccount(..))" , 
			       throwing = "exe")
	public void dowork(JoinPoint join , Throwable exe)
	{
		System.out.println("the target methode signature  : " + join.getSignature());
		System.out.println("inside the @AfterThrowing aspect : ");
		System.out.println("the advise result" + exe );
	}

}
