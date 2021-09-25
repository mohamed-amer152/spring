package com.luv2code.aopdemo.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.dao.Account;

@Aspect
@Component
@Order(1)
public class logging {

	
	
	// 1- applied for any methode in any package
	//@Before("execution(public void AddAccount())")
	
	// 2- specify the package 
	//@Before("execution(public void com.luv2code.aopdemo.dao.AcoountDAO.AddAccount())")
	
	// 3- the access modifier is optional
	// .- specify for any add* method 'wilecard'
	//@Before("execution(void Add*())")
	
	// 4- make the execute for any return type
	//@Before("execution(* Add*())")
	
	// 5- execute on method with one param
	//@Before("execution(* Add*(*))")
	
	// 6- execute to any method that have param or no 
	//@Before("execution(* Add*(..))")
	
	// 7- apply the execution inside any method in the package  
	//@Before("execution(* com.luv2code.aopdemo.dao.*.*(..))")
	
	// 8- use a predefined point cut inside my advise 
	//@Before("daopackage()")
	
	/*
	 * we can do combining for the point cuts inside one advise
	 * 1- and &&
	 * 2- or ||
	 * 3- not !
	 */
	
		
	// 9- combine the pointcut inside the aadvise
	// *  using the joinpoints so we can get the target method signature and parameters
		@Before("com.luv2code.aopdemo.aspects.AspectExpressions.daopackage() && "
				+ "!(com.luv2code.aopdemo.aspects.AspectExpressions.daoSetter() "
				+ " ||com.luv2code.aopdemo.aspects.AspectExpressions.daogetter() )")
		public void beforeaccountdao(JoinPoint joinPoint)
		{
			System.out.println("\n==========  ==== inside the  logging aspect-----------------------");
			// getting the target method signature 
			MethodSignature method = (MethodSignature) joinPoint.getSignature();
            System.out.println("\n the method signiture : " + method); 
            
            // getting the target method parameters
            Object [] args = joinPoint.getArgs();
            System.out.println("\nthe method parameters is : ");
            for(Object temp : args)
            {
            	System.out.println(temp.toString());
            	if (temp instanceof Account) {
					Account account = (Account) temp ;
					System.out.println("first name : " + account.getFirstName());
					System.out.println("level  : " + account.getLevel());
				}
            }
			
		}
		
		
		
		
		
		
		
	
}
