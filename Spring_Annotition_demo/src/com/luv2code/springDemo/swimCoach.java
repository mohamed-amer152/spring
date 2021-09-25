package com.luv2code.springDemo;

import org.springframework.beans.factory.annotation.Value;

public class swimCoach implements Coach {
	
	private FortuneService fortuneService ;
	
	@Value("${team.name}")
	private String name ;
	@Value("${team.email}")
	private String email ;
	
	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public swimCoach (FortuneService fr)
	{
		fortuneService = fr ;
	}

	@Override
	public String getDailyWork() {
		return "Swim alot win alot";
	}

	@Override
	public String getfortune() {
		return fortuneService.getfortun();
	}

}
