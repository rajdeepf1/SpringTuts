package com.example.MyWebApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {
	
	@RequestMapping("home")
	public String home() {
		System.out.println("hi...");
		return "home";
	}

}
