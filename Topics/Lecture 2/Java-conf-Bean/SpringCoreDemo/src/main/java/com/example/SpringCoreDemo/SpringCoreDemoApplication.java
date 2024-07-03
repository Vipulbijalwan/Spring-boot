package com.example.SpringCoreDemo;

import com.example.SpringCoreDemo.common.Coach;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCoreDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreDemoApplication.class, args);
	}

//In this we can Add java Class externally  we don't use @component annotation
	// see swim class we add .
}
