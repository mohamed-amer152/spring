package com.luv2code.mvcdemo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("home")
public class homeformController2 {

	
	@RequestMapping("/showform")
	public String show()
	{
		return "hello-form";
	}
	
	@RequestMapping("/processform")
	public String process()
	{
		return "process-form";
	}
	
	@RequestMapping("processform2")
	public String processform2(HttpServletRequest request , Model model)
	{
		String name = request.getParameter("studentName");
		name = name.toUpperCase();
		model.addAttribute("message","Hooooo  "+ name);
		return"process-form";
	}
	
	@RequestMapping("process3")
	public String process3(@RequestParam("studentName") String name , Model model)
	{
		name = name.toUpperCase();
		model.addAttribute("message","hi baby   "+ name);
		return"process-form";
	}
	
	
	
}
