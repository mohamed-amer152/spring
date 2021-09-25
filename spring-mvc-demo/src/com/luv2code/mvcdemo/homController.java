package com.luv2code.mvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homController {
	
	@RequestMapping("/")
	public String showpage()
	{
		
		return "main-menu" ;
	}

}
