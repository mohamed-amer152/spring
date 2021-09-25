package com.luv2code.testdb;

import java.sql.Connection;
import java.sql.DriverManager;

public class test {

	public static void main(String[] args) {



		 String user = "springstudent";
		 String pass = "springstudent";
		 String url = "jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false" ;
		 String driver = "com.mysql.jdbc.Driver";
		 
		 
		 try {
			
			 Class.forName(driver);
			 Connection connection = DriverManager.getConnection(url ,user ,pass);
			 System.out.print("Concted successfully");
			 connection.close();
			 
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}

}
