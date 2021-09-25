package com.luv2code.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class loginController {
	
	
	
	@GetMapping("/showlogin")
	public String login()
	{
		return "login";
	}
	
	
	@GetMapping("/accessDenied")
	public String accessDenied()
	{
		return "accessDenied";
	}

}
