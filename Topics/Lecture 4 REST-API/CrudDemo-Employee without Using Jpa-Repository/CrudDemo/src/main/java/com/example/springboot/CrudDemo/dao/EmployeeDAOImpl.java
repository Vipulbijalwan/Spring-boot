package com.example.springboot.CrudDemo.dao;

import com.example.springboot.CrudDemo.Entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

  //define field for entity Manager
    private EntityManager entityManager;

    //set constructor
    @Autowired
    public EmployeeDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {

        //creating a query
        TypedQuery<Employee> theQuery= entityManager.createQuery("from Employee",Employee.class);

        //execute query
        List<Employee> employees=theQuery.getResultList();

        //return result
        return employees;
    }

    @Override
    public Employee findById(int id) {
        //get employee
        Employee employee=entityManager.find(Employee.class,id);

        //return employee
        return employee;
    }

    @Override
    public Employee save(Employee theEmployee) {
//save employee
        Employee dbEmployee =entityManager.merge(theEmployee);
//return employee
        return dbEmployee;
    }

    @Override
    public void deleteById(int theId) {
        //find employee
        Employee theEmployee=entityManager.find(Employee.class,theId);

        //remove employee
        entityManager.remove(theEmployee);


    }
}
