package com.luv2code.aopdemo.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AroundAspect {
	
	@Around("execution(* com.luv2code.aopdemo.dao.MemberShipdao.calulat())")
	public Object dowork(ProceedingJoinPoint join) throws Throwable
	{
		System.out.println("inside @Around Aspect ==========");
		System.out.println("the methode signature is : "+ join.getSignature());
		
		// calculating the period that method took running 
		long start = System.currentTimeMillis();
		Object result = join.proceed();
		long end = System.currentTimeMillis();
		long period = end-start ;
		System.out.println(" method running time : " + (period/1000.0));
		
		return result ;
	}

}
