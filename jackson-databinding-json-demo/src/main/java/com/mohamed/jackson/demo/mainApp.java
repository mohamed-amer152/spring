package com.mohamed.jackson.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class mainApp {

	public static void main(String[] args) {


		try {
		ObjectMapper mapper = new ObjectMapper();
		student student_object = new student();
		student_object  = mapper.readValue(new File("data/sample-full.json"),student.class);
		
		
		adress add = student_object.getAddress();
		
		
		System.out.println(student_object.getFirstName());
		System.out.println(student_object.getLastName());
		System.out.println(add.getCity());
		System.out.println(add.getCountry());
		
		for(String temp : student_object.getLanguages())
		
			System.out.println(temp);
		
		
		}
		catch(Exception exe)
		{
			exe.printStackTrace();
		}
		
	}

}
