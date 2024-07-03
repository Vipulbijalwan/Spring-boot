package com.example.CRUDDEMO.dao;

import com.example.CRUDDEMO.Entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAOImp implements StudentDAO{

    //define field for entity Manager

private EntityManager entityManager;


//inject entity Manager using constructor injection
    @Autowired
    public StudentDAOImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    //implement save method
    @Override
    @Transactional//if we are using this it can update database
    public void save(Student thestudent) {
entityManager.persist(thestudent);
    }

    @Override
    public Student findById(Integer id) {
        return entityManager.find(Student.class,id);
    }


}
