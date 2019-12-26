package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(FirstProjectApplication.class, args);

		// System.out.println("Welcome to Boot...");

		  AlienModel a = context.getBean(AlienModel.class); //dependency injection
		  
		  a.show();
		  
		
		 

	}

}
