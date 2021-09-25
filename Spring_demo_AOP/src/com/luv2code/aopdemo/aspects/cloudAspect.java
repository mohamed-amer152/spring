package com.luv2code.aopdemo.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class cloudAspect {
	@Before("com.luv2code.aopdemo.aspects.AspectExpressions.daopackage()")
	public void cloud()
	{
	
		System.out.println("\\n==========  ==== inside the  cloudAspect -----------------------");
	}

}
