package com.luv2code.springDemo;

public class criket implements Coach {

	private fortuneservices fortuneservices ;
	private String email ;
	private String team ;
	
	
	
	public String getEmail() {
		return email;
	}



	public String getTeam() {
		return team;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public void setTeam(String team) {
		this.team = team;
	}



	public criket() {
		System.out.println("hi no arg constructor : criket");
	}
	
	

	public void setFortuneservices(fortuneservices fortuneservices) {
		System.out.println("hi  setFortuneservices : criket");
		this.fortuneservices = fortuneservices;
		
	}



	@Override
	public String getdaily() {
		// TODO Auto-generated method stub
		return "go run";
	}

	@Override
	public String getDailyfortion() {
		// TODO Auto-generated method stub
		return null;
	}

}
