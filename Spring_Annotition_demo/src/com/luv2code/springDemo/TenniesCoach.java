package com.luv2code.springDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import javax.annotation.*;

@Component
public class TenniesCoach implements Coach {

	@Autowired
	@Qualifier("randomFortyneService")
	private FortuneService fortuneService ;
	
//	@Autowired
//	public TenniesCoach (FortuneService thefr )
//	{
//		fortuneService = thefr ;
//	}
	
	
	// have to add the jar file for javax annotatoin 
	@PostConstruct
	public void before()
	{
		System.out.println("from befoer costruct");
	}
	
	
	
	
	
	@Override
	public String getDailyWork() {
		// TODO Auto-generated method stub
       return "Common Do Your job";
	}
//
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}

	@Override
	public String getfortune() {
		// TODO Auto-generated method stub
		return fortuneService.getfortun();
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
