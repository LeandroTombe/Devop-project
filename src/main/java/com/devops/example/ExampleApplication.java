package com.devops.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ExampleApplication {

	@GetMapping
	public String message(){
		return "Welcome to devops project";
	}

	public static void main(String[] args) {
		SpringApplication.run(ExampleApplication.class, args);
	}

}