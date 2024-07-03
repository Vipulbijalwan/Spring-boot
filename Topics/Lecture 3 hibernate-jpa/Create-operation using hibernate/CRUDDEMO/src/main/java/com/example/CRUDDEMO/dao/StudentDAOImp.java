package com.example.CRUDDEMO.dao;

import com.example.CRUDDEMO.Entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

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

    @Override
    public List<Student> findAll() {
        //Create query
        TypedQuery<Student> theQuery= entityManager.createQuery("FROM Student order by gmail  ",Student.class);

        //return query result
        return theQuery.getResultList();
    }

    @Override
    public List<Student> findByFirstName(String firstName) {
        TypedQuery<Student> query= entityManager.createQuery("FROM Student WHERE firstName=:theData",Student.class);

        query.setParameter("theData",firstName);

        return  query.getResultList();
    }


}
