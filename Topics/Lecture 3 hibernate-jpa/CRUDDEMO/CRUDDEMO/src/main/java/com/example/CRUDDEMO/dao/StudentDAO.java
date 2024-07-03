package com.example.CRUDDEMO.dao;

import com.example.CRUDDEMO.Entity.Student;

public interface StudentDAO {
    void save(Student student);
    Student findById(Integer id);
}
