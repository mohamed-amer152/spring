package com.luv2code.springDemo;

public class trackcoach implements Coach {
	
	private fortuneservices Fortuneservices ;
	private trackcoach(fortuneservices fr)
	{
		Fortuneservices = fr ;
	}

	@Override
	public String getdaily() {
		// TODO Auto-generated method stub
		return "do it hard";
	}

	@Override
	public String getDailyfortion() {
		// TODO Auto-generated method stub
		//return Fortuneservices.getfortun();
		return null ;
	}

}
