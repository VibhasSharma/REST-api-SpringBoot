package com.example.StudentRestAPI.Student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

@Service
public class StudentService {
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
