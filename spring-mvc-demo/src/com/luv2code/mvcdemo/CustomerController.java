package com.luv2code.mvcdemo;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	
	// adding preprocess method that is being run at first before all methode in the controller 
	// will add string trimmer that will delete all leader or trailer white spaces from all strings comming frm any form
	// will also put the string back to null if it only has white space
	
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder )
	{
	// putting the String back to null if it only has white spaces 	using(true)
	  StringTrimmerEditor editor = new StringTrimmerEditor(true);	
	//   rempving white spces 
	  dataBinder.registerCustomEditor(String.class, editor);
		
	}
	
	
	
	
	@RequestMapping("showform")
	public String showform(Model model)
	{
		customer cust = new customer();
		model.addAttribute("customer", cust);
		return "show-customer" ;
	}
	
	
	
	@RequestMapping("/processform")
	public String processform( @Valid 
			@ModelAttribute("customer") customer cust , BindingResult theresult)
	{
		
		System.out.println("|"+cust.getLastName() + "|");
		
		// print the binding result so if their is an error u can got all information easily 
		System.out.println("/n/n/n/n/n"+theresult);
		
		if (theresult.hasErrors()) {
			return "show-customer" ;
		} else {
			return "customer-confirm" ;
		}

	}
	
	
	

}
