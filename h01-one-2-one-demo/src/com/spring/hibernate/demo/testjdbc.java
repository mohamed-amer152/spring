package com.spring.hibernate.demo;

import java.sql.Connection;
import java.sql.DriverManager;

public class testjdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	       String jdbcurl = "jdbc:mysql://localhost:3306/hb-01-one-to-one-uni?useSSL=false";
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


