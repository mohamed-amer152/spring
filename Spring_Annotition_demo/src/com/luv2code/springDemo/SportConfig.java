package com.luv2code.springDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:swim")
//@ComponentScan("com.luv2code.springDemo")
public class SportConfig {
	@Bean
	public FortuneService sadone()
	{
		return new sadservices();
	}
	
	
	@Bean
	public Coach swimming()
	{
		return new swimCoach(sadone());
	}

}
