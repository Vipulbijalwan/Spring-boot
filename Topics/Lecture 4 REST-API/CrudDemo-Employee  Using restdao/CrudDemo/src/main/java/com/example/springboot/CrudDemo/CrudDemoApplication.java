package com.example.springboot.CrudDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudDemoApplication.class, args);
	}
//for making rest app we don't need
	// 1 controller
	// 2 service layer
	// we need only
	//1 dependency of rest
	//2 entity class
	//3 Jpa repository
}
