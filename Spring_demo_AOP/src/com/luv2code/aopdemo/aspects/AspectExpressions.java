package com.luv2code.aopdemo.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectExpressions {
	
	// creating all pointcut exprations here 
	//* declare  pointcuts
	
		// setter methods
		@Pointcut("execution(* com.luv2code.aopdemo.dao.*.set*(*))")
		public void daoSetter() {};
		
		// getter methods
			@Pointcut("execution(* com.luv2code.aopdemo.dao.*.get*())")
			public void daogetter() {};
			
			// declaring pointcut that can be reused for the advices
			@Pointcut("execution(* com.luv2code.aopdemo.dao.*.*(..))")
			public void daopackage () {};

}
