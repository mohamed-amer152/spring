package com.luv2code.mvcdemo;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("student")
public class studentController {
	
	// retrivint the option from the file 
	@Value("#{countryOptions}")
	private Map<String, String> countryOptions ;
	
	@RequestMapping("showform")
	public String showform(Model model)
	{
		Student thestud = new Student();
		model.addAttribute("student",thestud);
		// adding the optoins for the dow list to the model 
		model.addAttribute("thecountryOptions", countryOptions);
		return "showStudent" ;
	}
	
	
	
	@RequestMapping("processform")
	public String process(@ModelAttribute("student") Student stud)
	{
		// we can log the informatoin comming from the customer in the model attribute 
		System.out.println(stud.getFirstname());
		return "student-confirm";
	}
	

}
