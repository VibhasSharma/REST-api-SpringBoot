package com.example.StudentRestAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@SpringBootApplication
@RestController
public class StudentRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentRestApiApplication.class, args);
	}

	@GetMapping
	public String hello(){
		return "Hello REST API World";
	}
}
