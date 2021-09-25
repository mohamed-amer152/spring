package com.luv2code.springDemo;

import org.springframework.stereotype.Component;

@Component
public class HappyfortunServices implements FortuneService {

	@Override
	public String getfortun() {
		// TODO Auto-generated method stub
		return "You are so lucky";
	}

}
