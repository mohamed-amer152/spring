package com.luv2code.springsecurity.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DmoController {

	@GetMapping("/showloginform")
	public String showloginform()
	{
		return "fancy-login" ;
	}
	
	@GetMapping("/")
	public String home()
	{
		return "home" ;
	}
	
	@GetMapping("/admin")
	public String leader()
	{
		return "admin" ;
	}
	
	@GetMapping("/manager")
	public String manager()
	{
		return "manger" ;
	}
	
	@GetMapping("/customerror")
	public String denidaccess()
	{
		return "customerror" ;
	}
	
	
}
