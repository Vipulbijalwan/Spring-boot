package com.example.demo.rest;

import com.example.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    private List<Student> theStudents;


    @PostConstruct
    public void loadStudent(){
        theStudents=new ArrayList<>();
        theStudents.add(new Student("vipul","Bijalwan"));
        theStudents.add(new Student("Nikhil","Bijalwan"));
        theStudents.add(new Student("Deepu","Bijalwan"));

    }


    @GetMapping("/student")
    public List<Student> getStudent(){
       return theStudents;
}

    @GetMapping("/student/{studentId}")
    public Student getStudent(@PathVariable int studentId)  {
      return theStudents.get(studentId);
    }


}
