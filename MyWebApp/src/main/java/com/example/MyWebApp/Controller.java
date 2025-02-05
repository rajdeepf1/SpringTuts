package com.example.MyWebApp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class Controller {
	
//	@RequestMapping("home")
//	public String home(HttpServletRequest req, HttpServletResponse res) {
//		
//		HttpSession httpSession = req.getSession();
//		
//		String name = req.getParameter("name");
//		
//		System.out.println("hi..."+name);
//		
//		httpSession.setAttribute("nameKey", name);
//		
//		return "home";
//	}
	
	
//	@RequestMapping("home")
//	public String home(@RequestParam("name")String myName, HttpSession session) { // @RequestParam is for mapping keys from url (used for multiple params)
//		
//		
//		System.out.println("hi..."+myName);
//		
//		session.setAttribute("nameKey", myName);
//		
//		return "home";
//	}
	
	
//	@RequestMapping("home")
//	public ModelAndView home(@RequestParam("name")String myName) { // ModelAndView is for passing data to ur jsp page
//		
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.addObject("nameKey",myName);
//		modelAndView.setViewName("home");
//		
//		return modelAndView;
//	}
	
	
	@RequestMapping("home")
	public ModelAndView home(AlienModel alienModel) { // passing data to jsp page using model class i.e. AlienModel {url= http://localhost:8080/home?aID=1&alienName=Rajdeep&alienLang=Java}
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("obj",alienModel);
		modelAndView.setViewName("home");
		
		return modelAndView;
	}


}
