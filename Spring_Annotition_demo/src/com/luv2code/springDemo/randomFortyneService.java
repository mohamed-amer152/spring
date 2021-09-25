package com.luv2code.springDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class randomFortyneService implements FortuneService {
	
	
	private String data ;
	
	// define preconstruct method 
	//@PostConstruct
//	public void readfortune()
//	{
//		File  book = new File("C:\\Users\\Amer\\Desktop\\sport.txt");
//		try {
//			Scanner scann = new Scanner(book);
//			if (scann.hasNext()) {
//			data = scann.nextLine();
//				System.out.println(data);
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}

	@Value("${foo.ff}")    
	private String first ;
	@Value("${foo.sf}")
	private String second ;
	@Value("${foo.tf}")
	private String third ;
	@Value("${foo.pf}")
	private String fourth ;
	
	//private String [] picks = {first,second,third,fourth};
	private ArrayList list = new ArrayList();
		
	Random rany = new Random();
	
	
	
	@Override
	public String getfortun() {
	//String [] picks = {first,second,third,fourth};
		list.add(first);
		list.add(second);
		list.add(third);
		list.add(fourth);
		 int num = rany.nextInt(list.size());
		String fortune = list.get(num).toString();
		// String fortune = picks[num];
		return fortune;
		//return data ;
	}

}
