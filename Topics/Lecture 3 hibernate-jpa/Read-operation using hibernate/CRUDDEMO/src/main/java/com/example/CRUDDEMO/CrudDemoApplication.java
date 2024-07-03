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

	readStudent(studentDAO);

	};
}





	private void readStudent(StudentDAO studentDAO){


		//retrieve student based on id
		System.out.println("student id : "+theId);
		Student mystudent=studentDAO.findById(theId);

		//display student
		System.out.println("Found the student : "+mystudent);
	}

}
