package com.example.StudentRestAPI;

import com.example.StudentRestAPI.Student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
@RestController
public class StudentRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentRestApiApplication.class, args);
	}

	@GetMapping
	public ArrayList<Student> StudentList() {
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(
				new Student(
				1L,
				"Vibhas Sharma",
				"vibhas@testMail.com",
				LocalDate.of(1996, Month.MAY, 16),
				21
				)
		);
		return (students);
	}
}
