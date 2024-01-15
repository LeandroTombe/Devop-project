package com.devops.example;

import static org.slf4j.LoggerFactory.*;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;


@SpringBootApplication
@Slf4j
public class ExampleApplication implements CommandLineRunner {




	@GetMapping
	public String message(){
		return "Welcome to devops project";
	}

	public static void main(String[] args) {
		log.info("it's continues integration job");
		SpringApplication.run(ExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("it's my second logger");
	}
}
