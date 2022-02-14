package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	//show form method
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	//process form method
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	//read form data and add to model
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		//read request parameter from form
		String theName = request.getParameter("studentName");
		
		//convert data into all uppercase
		theName = theName.toUpperCase();
		
		//create message
		String result = "Yo! " + theName;
		
		//add message to model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
}
