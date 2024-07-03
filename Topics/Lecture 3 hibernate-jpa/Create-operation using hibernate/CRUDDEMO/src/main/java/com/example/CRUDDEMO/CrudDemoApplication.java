package com.example.CRUDDEMO;

import com.example.CRUDDEMO.Entity.Student;
import com.example.CRUDDEMO.dao.StudentDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CrudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudDemoApplication.class, args);
	}
@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO)
{
	return runner ->{
	createStudent(studentDAO);
	};
}

	private void createStudent(StudentDAO studentDAO) {
		//create the student object
		System.out.println("Creating 3 student object....");
		Student tempstudent = new Student("vikas", "Bijalwan", "vikas@123");

		Student tempstudent2 = new Student("vinod", "Bijalwan", "vinod@123");
		Student tempstudent3 = new Student("Abi", "Bijalwan", "abhi@123");
		Student tempstudent4 = new Student("Aman", "Bijalwan", "aman@123");
		Student tempstudent5 = new Student("nikhil", "Bijalwan", "nikhil@123");
		Student tempstudent6 = new Student("Vipul", "Bijalwan", "vipul@123");
		Student tempstudent7 = new Student("deepu", "Bijalwan", "deepu@123");
		//save the student object
		System.out.println("Saving the student......");
		studentDAO.save(tempstudent);
		studentDAO.save(tempstudent2);
		studentDAO.save(tempstudent3);
		studentDAO.save(tempstudent4);
		studentDAO.save(tempstudent5);
		studentDAO.save(tempstudent6);
		studentDAO.save(tempstudent7);


	}

		//display id of the saved student
		int theId= tempstudent.getId();
		System.out.println("saved student. Generated id: "+tempstudent.getId());
	}



