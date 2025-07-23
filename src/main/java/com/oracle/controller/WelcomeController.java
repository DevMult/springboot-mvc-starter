package com.oracle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/webpage")
public class WelcomeController {
	
	//http://localhost:9095/mvc-starter/welcome
	@GetMapping("/welcome")
	public String welcome() {
		return "welcome"; //WEB-INF/pages/welcome.jsp
	}
}
