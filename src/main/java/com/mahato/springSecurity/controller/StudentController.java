package com.mahato.springSecurity.controller;

import com.mahato.springSecurity.entity.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class StudentController {

    private List<Student> studentList = new ArrayList<>(Arrays.asList(
            new Student(1,"Swastika Raj Dangi",7),
            new Student(2,"Ankita Kumari",7),
            new Student(3,"Megha Kumari",8)
    ));

    @GetMapping("/students")
    public List<Student> getStudents() {
        return studentList;
    }

    @GetMapping("/csrf-token")
    public CsrfToken getToken(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");
    }

    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student) {
        studentList.add(student);
        return student;
    }
}
