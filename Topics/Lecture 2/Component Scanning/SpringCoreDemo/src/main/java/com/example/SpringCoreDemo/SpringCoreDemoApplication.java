package com.example.SpringCoreDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.exp","com.example.SpringCoreDemo"})//In this include  both package
public class SpringCoreDemoApplication {



	public static void main(String[] args) {
		SpringApplication.run(SpringCoreDemoApplication.class, args);
	}
//Making different package
	//Java class in different package
}
