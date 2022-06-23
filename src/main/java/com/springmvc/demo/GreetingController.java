package com.springmvc.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {
	
	public GreetingController() {
		System.out.println("*******controller is called *******");
	}
	
	//Method = GET/ ACTION = /welcome
	@GetMapping("/welcome")
	public String greetWhenInvoked() {
		
		return "welcome"; 
	}
	
	@GetMapping("/user")
	public String displayUserName(HttpServletRequest req) {
		String name = req.getParameter("name");
		req.setAttribute("uname", name); //key-value pair "uname" is used to access name in jsp
		return "username";
	}

}
