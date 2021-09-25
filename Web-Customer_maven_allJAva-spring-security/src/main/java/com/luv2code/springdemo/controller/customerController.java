package com.luv2code.springdemo.controller;

import java.util.List;

import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv2code.springdemo.entity.customer;
import com.luv2code.springdemo.services.customerService;

@Controller
@RequestMapping("/customer")
public class customerController {
	
	//inject service  to the controller 
	@Autowired
	private customerService customerservices ;
	
	@RequestMapping("/list")
	public String customerlist(Model model)
	{
		// get the customer list 
		List<customer> customerlist = customerservices.customerlist();
		
		//add the list to the model
		model.addAttribute("customer" , customerlist);
		return "list-customer" ;
	}
	
    @GetMapping("/showformforadd")
    public String addcustomer(Model model)
    {
    	customer cust = new customer();
    	model.addAttribute("customer" , cust);
    	return "add-customer" ;
    }


    @PostMapping("/savecustomer")
    public String save(@ModelAttribute("customer") customer cust)
    {
    	customerservices.savecustomer(cust);
    	return "redirect:/customer/list";
    }
    
    @GetMapping("/showformforupdate")
    public String update(Model model , 
    		        @RequestParam(name ="studentId") int studentid )
    {
    	// get the customer from the database with id 
    	customer thecust = customerservices.getcustomer(studentid);
    	//make customer as model atterbute  to prepopulate the data
    	model.addAttribute("customer" , thecust);
    	return"add-customer";
     }
    
    
    @GetMapping("/deleteform")
    public String delete (@RequestParam("studentID") int sid)
    {
    	customerservices.deletecustomer(sid);
    	return "redirect:/customer/list";
    }
    
    @GetMapping("/search")
	public String search(@ModelAttribute("SearchName") String key,Model model)
	{
    	
    	if (key != null && key != "") {
		
				// get the customer list 
				List<customer> customerlist = customerservices.search(key);
				if(customerlist != null) {
				//add the list to the model
				model.addAttribute("customer" , customerlist);
				
				}
		
    	}
		
		return "list-customer" ;
	}

}
