package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component //only single time objects creates
//@Scope(value="prototype") // every time create objects when getbean method calls
@Component
public class AlienModel {
	
	private int id;
	private String alienName;
	private String technology;
	@Autowired // autowired will search object by type
	//@Qualifier // Qualifier will search object by name 
	private Laptop laptop;	
	
	


	public AlienModel() {
		super();
		System.out.println("Object Created......");
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAlienName() {
		return alienName;
	}
	public void setAlienName(String alienName) {
		this.alienName = alienName;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	
	public Laptop getLaptop() {
		return laptop;
	}


	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	
	public void show() {
		System.out.println("Inside Show Method");
		laptop.compile();
	}
	
	

}
