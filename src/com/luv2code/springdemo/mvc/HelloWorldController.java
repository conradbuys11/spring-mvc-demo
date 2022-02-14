package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
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
	
}
