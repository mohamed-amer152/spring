package com.luv2code.springDemo;

public class fbcoach implements Coach{
	
	// define object from the dependecy interface
	private fortuneservices Frservices ;
	
	// define the constructor 
	
	public fbcoach( fortuneservices fr)
	{
		Frservices = fr ;
	}
	
	
	
	
	
	@Override
	public String getdaily()
	{
		return "have abenfit " ;
	}

	@Override
	public String  getDailyfortion() {
		return Frservices.getfortun();
		//return null ;
	}
	
	
	public void domyStartup()
	{
		System.out.println("\nthis from doing strtup");
	}
	
	

	public void domyDestroy()
	{
		System.out.println("\nthis from doing cleaning stuff");
	}
	
	
	

}
