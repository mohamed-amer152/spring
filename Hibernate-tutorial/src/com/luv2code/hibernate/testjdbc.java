package com.luv2code.hibernate;

import java.sql.Connection;
import java.sql.DriverManager;

public class testjdbc {
	
	

	public static void main(String[] args) {

       String jdbcurl = "jdbc:mysql://localhost:3306/hb_student-tracker?useSSL=false";
       String user = "hbstudent";
       String pass = "hbstudent";
       
       try {
		   
    	   Connection connectoin = DriverManager.getConnection(jdbcurl,user , pass);
    	   System.out.println("Connected Sucessfully    ..........");
	} catch (Exception e) {

		e.printStackTrace();
	}
		
	}

}
