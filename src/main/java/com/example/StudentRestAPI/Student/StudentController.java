package com.example.StudentRestAPI.Student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

@RestController
@RequestMapping(path="api/v1/student")
public class StudentController {
    @GetMapping
    public ArrayList<Student> getStudents() {
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
