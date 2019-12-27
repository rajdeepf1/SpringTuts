package com.example.bootjpa.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

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
	
}
