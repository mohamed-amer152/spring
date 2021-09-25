package com.luv2code.springDemo;

import java.util.Random;

public class happyfrservices implements fortuneservices {

	private String [] choices = {
			"habby new year",
			"happy comming year",
			"happy past year"
	};
	
	private Random newRandom = new Random();
	@Override
	public String getfortun() {

		int index = newRandom.nextInt(choices.length);
		
		String fortune = choices[index];
		return fortune;
	}

}
