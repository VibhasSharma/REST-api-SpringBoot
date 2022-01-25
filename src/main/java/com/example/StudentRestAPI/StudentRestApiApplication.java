package com.example.StudentRestAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class StudentRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentRestApiApplication.class, args);
	}
}
