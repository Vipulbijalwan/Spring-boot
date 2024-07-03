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

//while running the code first init method work than other method work @PostConstructor
//if code is stop than  destroy method work in this we can write code for close file and other stuff.@PreDestroy

}
