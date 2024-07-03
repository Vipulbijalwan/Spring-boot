package com.example.springboot.CrudDemo.dao;

import com.example.springboot.CrudDemo.Entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
    Employee findById(int Id);
    Employee save(Employee theEmployee);
    void deleteById(int theId);
}
