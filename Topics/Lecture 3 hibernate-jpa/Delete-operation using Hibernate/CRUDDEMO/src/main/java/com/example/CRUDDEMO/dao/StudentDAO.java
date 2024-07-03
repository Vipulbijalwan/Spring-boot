package com.example.CRUDDEMO.dao;

import com.example.CRUDDEMO.Entity.Student;

import java.util.List;

public interface StudentDAO {
    void save(Student student);
    Student findById(Integer id);
    List<Student> findAll();
    List<Student> findByFirstName(String firstName);
    void  update(Student  thestudent);
    void  delete(Integer Id);

    int deleteAll();
}
