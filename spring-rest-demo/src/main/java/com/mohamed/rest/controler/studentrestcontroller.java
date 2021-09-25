package com.mohamed.rest.controler;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mohamed.rest.entity.student;
import com.mohamed.rest.error.CustomException;
import com.mohamed.rest.error.ResponseError;

@RestController
@RequestMapping("/api")
public class studentrestcontroller {
	
	private List<student> list ;
	
	// create the student list in the post construct 
	@PostConstruct
	public void load()
	{

		list = new ArrayList<>();
		
		student studentobject1 = new student("mohamed", "amer");
		student studentobject2 = new student("mohamed", "rezk");
		student studentobject3 = new student("mohamed", "basuony");
		list.add(studentobject1);
		list.add(studentobject2);
		list.add(studentobject3);
		
	}
	
	
	
	@GetMapping("/student")
	public List<student> getstudent ()
	{
        list = new ArrayList<>();
		
		student studentobject1 = new student("mohamed", "amer");
		student studentobject2 = new student("mohamed", "rezk");
		student studentobject3 = new student("mohamed", "basuony");
		list.add(studentobject1);
		list.add(studentobject2);
		list.add(studentobject3);
		return list ;
	}
	
	
	// get the Student based on the id 
	@GetMapping("/student/{studentID}")
	public student getstudent2(@PathVariable int studentID)
	{
		if (studentID < 0 ||  studentID >= list.size()) {
			
			 throw new CustomException("studentID not found");
		} else {
			return list.get(studentID);
		}
		
	}
	
	
	
	
	
	

}
