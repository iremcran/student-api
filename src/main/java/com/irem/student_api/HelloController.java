package com.irem.student_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @GetMapping("/students")
    public List<Student> getStudents() {

        Student s1 = new Student(1,"Irem","Computer Engineering");
        Student s2 = new Student(2,"Mehmet","Mechanical Engineering");
        Student s3 = new Student(3,"Ayse","Architecture");

        return List.of(s1,s2,s3);
    }
}
