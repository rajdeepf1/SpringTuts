package com.example.MyWebApp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {
	
	@RequestMapping("home")
	public String home(HttpServletRequest req, HttpServletResponse res) {
		
		HttpSession httpSession = req.getSession();
		
		String name = req.getParameter("name");
		
		System.out.println("hi..."+name);
		
		httpSession.setAttribute("nameKey", name);
		
		return "home";
	}

}
