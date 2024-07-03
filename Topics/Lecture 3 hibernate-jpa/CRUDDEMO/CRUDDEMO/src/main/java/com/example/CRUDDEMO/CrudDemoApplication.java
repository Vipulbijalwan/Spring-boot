package com.example.CRUDDEMO;

import com.example.CRUDDEMO.Entity.Student;
import com.example.CRUDDEMO.dao.StudentDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudDemoApplication.class, args);
	}
@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO)
{
	return runner ->{
//	createStudent(studentDAO);
	readStudent(studentDAO);
	};
}

//	private void createStudent(StudentDAO studentDAO) {
//		//create the student object
//		System.out.println("Creating 3 student object....");
//		Student tempstudent=new Student("vipul","Bijalwan","vipul@123");
//
//		Student tempstudent2=new Student("vipul2","Bijalwan","vipul@123");
//
//		//save the student object
//		System.out.println("Saving the student......");
//		studentDAO.save(tempstudent);
//		studentDAO.save(tempstudent2);
//
//		//display id of the saved student
//		int theId= tempstudent.getId();
//		System.out.println("saved student. Generated id: "+tempstudent.getId());
//	}

	private void readStudent(StudentDAO studentDAO){
		System.out.println("Creating 3 student object....");
		Student tempstudent=new Student("vipul","Bijalwan","vipul@123");

		Student tempstudent2=new Student("vijay","Bijalwan","vipul@123");

		//save the student object
		System.out.println("Saving the student......");
		studentDAO.save(tempstudent);
		studentDAO.save(tempstudent2);

		//display id of the saved student
		int theId= tempstudent2.getId();
		System.out.println("saved student. Generated id: "+tempstudent2.getId());

		//retrieve student based on id
		System.out.println("student id : "+theId);
		Student mystudent=studentDAO.findById(theId);

		//display student
		System.out.println("Found the student : "+mystudent);
	}
}
