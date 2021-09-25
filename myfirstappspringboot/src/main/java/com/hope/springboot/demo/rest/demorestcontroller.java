package com.hope.springboot.demo.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demorestcontroller {

	@GetMapping("/")
	public String hello()
	{
		return  "hello first spring boot app : " + LocalDateTime.now() + "  yeeeeeeeeeeey********" ;
	}



}
