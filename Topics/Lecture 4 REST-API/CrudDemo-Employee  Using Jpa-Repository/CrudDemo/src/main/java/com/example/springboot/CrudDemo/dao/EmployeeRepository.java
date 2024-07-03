package com.example.springboot.CrudDemo.dao;

import com.example.springboot.CrudDemo.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
