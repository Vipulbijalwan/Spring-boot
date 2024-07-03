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
//	createStudent(studentDAO);
//	readStudent(studentDAO);
//		queryForStudent(studentDAO);
//		queryForStudentByFirstName(studentDAO);
		updateStudent(studentDAO);
	};
}

private void updateStudent(StudentDAO studentDAO){
		//retrieve student based on the id
	int studentId=1;
	System.out.println("Getting student with id : "+studentId);
Student myStudent=studentDAO.findById(studentId);
	//change first name to "Dollar"
	System.out.println("Updating student....");
	myStudent.setFirstName("Rinku");

	//update student
	studentDAO.update(myStudent);

	//display student
	System.out.println("update student " +myStudent);
	}

}
