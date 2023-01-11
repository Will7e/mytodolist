package com.example.mytodolist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TodolistApplication {


	@GetMapping("/")
	public String welcomeMessage(){
		return " Welcome to my site";
	}

	public static void main(String[] args) {
		SpringApplication.run(TodolistApplication.class, args);
	}


}
