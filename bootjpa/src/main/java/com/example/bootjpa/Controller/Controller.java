package com.example.bootjpa.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.bootjpa.dao.AlienRepo;
import com.example.bootjpa.model.AlienModel;

@org.springframework.stereotype.Controller
public class Controller {
	
	@Autowired
	AlienRepo repo;

	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping("/addAlien")
	public String addAlien(AlienModel model) {
		repo.save(model);
		return "home.jsp";
	}
	
	@RequestMapping("/getAlien")
	public ModelAndView getAlien(@RequestParam int aid) {
		
		ModelAndView modelAndView = new ModelAndView("showAlien.jsp");
		
		AlienModel alien = repo.findById(aid).orElse(new AlienModel());
		
		System.out.println(alien.getAname());
		
		modelAndView.addObject("obj",alien);
		
		System.out.println(repo.findByTech("Spring Boot"));
		
		
		return modelAndView;
	}
	
	@RequestMapping("/getAliens")
	@ResponseBody
	public String getAlien() {
		
		
		
		
		return repo.findAll().toString();
	}
	
	
	@RequestMapping("/getAlienBy/{aid}")
	@ResponseBody
	public String getAlienBy(@PathVariable("aid") int aid) {
	
		
		return repo.findById(aid).toString();
	}
	
	
}
