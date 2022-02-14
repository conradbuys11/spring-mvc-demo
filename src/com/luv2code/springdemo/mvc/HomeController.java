package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String showPage() {
		//remember that the config file adds the prefix and suffix
		//ends up being /WEB-INF/view/main-menu.jsp
		return "main-menu";
	}
}
