package com.example.demo.rest;

import com.example.demo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import  org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    @GetMapping("/student")
    public List<Student> getStudent(){

        List<Student> theStudents =new ArrayList<>();
        theStudents.add(new Student("vipul","Bijalwan"));
        theStudents.add(new Student("Nikhil","Bijalwan"));
        theStudents.add(new Student("Deepu","Bijalwan"));
return theStudents;
    }
}
