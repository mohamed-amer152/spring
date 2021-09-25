package com.luv2code.mvcdemo;

import java.util.LinkedHashMap;

public class Student {
	
	
	private String firstname ;
	private String lastname ;
	private String country;
	private String favourotelanguges ;
	//private LinkedHashMap country_optoines ;
	private LinkedHashMap favourotelanguges_optoines ;
	private String [] operatingSystems ;
	
	public String [] getOperatingSystems() {
		return operatingSystems;
	}



	public void setOperatingSystems(String [] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}



	/// here the country_optoines we can initiate it with hard code or from db or file ......
	public Student()
	{
//		country_optoines = new LinkedHashMap<>();
//		
//		country_optoines.put("egy", "EGYPT");
//		country_optoines.put("ir", "IRAQ");
//		country_optoines.put("tun", "TUNISA");
//		country_optoines.put("asa", "ASWAN");
//		country_optoines.put("sad", "SAIDA");
//		country_optoines.put("uk", "UNITED KINGDOM");
		
//		
		
		
		favourotelanguges_optoines = new LinkedHashMap<>();
		favourotelanguges_optoines.put("java", "javaaaaaaaaa");
		favourotelanguges_optoines.put("php", "php");
		favourotelanguges_optoines.put("json", "json");
		favourotelanguges_optoines.put("python", "python");
		
	}
	
	
	
//	public LinkedHashMap getCountry_optoines() {
//		return country_optoines;
//	}

	


	public String getFavourotelanguges() {
		return favourotelanguges;
	}

	public LinkedHashMap getFavourotelanguges_optoines() {
		return favourotelanguges_optoines;
	}



	public void setFavourotelanguges(String favourotelanguges) {
		this.favourotelanguges = favourotelanguges;
	}

	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	
	

}
