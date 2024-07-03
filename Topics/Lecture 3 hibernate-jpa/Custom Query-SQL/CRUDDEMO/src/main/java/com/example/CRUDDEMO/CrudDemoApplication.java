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
		queryForStudentByFirstName(studentDAO);
	};
}

	private void queryForStudentByFirstName(StudentDAO studentDAO) {
		List<Student> thestudent=studentDAO.findByFirstName("sushil");
		for (Student tempstudent:thestudent){
			if(thestudent.isEmpty())
			{
				System.out.println("Not present.....");
			}
			System.out.println(tempstudent);
		}
	}
//...............................QUERY....................................
//	private void queryForStudent(StudentDAO studentDAO) {
////get a list of students
//		List<Student> thestudents=studentDAO.findAll();
//
//
//		//display list of student
//		for (Student tempstudent :thestudents){
//			System.out.println(tempstudent);
//		}
//	}
////

}
