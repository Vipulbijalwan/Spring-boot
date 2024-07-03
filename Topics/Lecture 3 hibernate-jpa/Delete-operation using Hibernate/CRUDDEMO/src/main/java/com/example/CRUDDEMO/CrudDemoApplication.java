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
//		updateStudent(studentDAO);
//		deleteStudent(studentDAO);
		deleteAllStudent(studentDAO);
	};
}

	private void deleteAllStudent(StudentDAO studentDAO) {
		System.out.println("Delete all student");
		int numRow=studentDAO.deleteAll();
		System.out.println("Deleting row count : "+numRow);
	}

//	private void deleteStudent(StudentDAO studentDAO) {
//		int studentId=4;
//
//		System.out.println("Deleting student id : "+studentId);
//		studentDAO.delete(studentId);
//
//
//
//	}


}
