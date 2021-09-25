package com.amer.springboot.thymleavedemo.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.amer.springboot.thymleavedemo.entity.employee;

@Controller
@RequestMapping("/employee")
public class employeeController {
	
	@GetMapping("/hello")
	public String hello(Model model)
	{
		Date date = new Date();
		model.addAttribute("theTime", date.toString());
		return "hello" ;
	}

	@GetMapping("/list")
	public String getempls(Model model)
	{
		List<employee> empllist = new ArrayList<>();
		empllist.add(new employee(1, "mohamed", "amer", "com.amer@code"));
		empllist.add(new employee(2, "mohamed", "rezk", "com.amer@code"));
		empllist.add(new employee(3, "mohamed", "basyny", "com.amer@code"));
		empllist.add(new employee(4, "mohamed", "esmeel", "com.amer@code"));
		
		model.addAttribute("list", empllist);
		
		return "list" ;
	}


}
