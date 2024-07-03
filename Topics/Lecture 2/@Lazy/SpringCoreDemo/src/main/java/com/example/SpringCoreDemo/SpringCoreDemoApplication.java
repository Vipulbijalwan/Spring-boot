package com.example.SpringCoreDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Lazy;

@SpringBootApplication
public class SpringCoreDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreDemoApplication.class, args);

		//When we run the spring application then all the bean of classes made in run time
//		In constructor :BaseballCoach
//		In constructor :CricketCoach
//		In constructor :TennisCoach
//		In constructor :DemoController
//		In constructor :TrackCoach
//	.........................using @Lazy.......................................
//		if we  use @Lazy then the bean of that class is made when we are using that class bean.
//		In constructor :BaseballCoach
//		In constructor :CricketCoach
//		In constructor :TennisCoach
//		In constructor :DemoController
//  ...................Global initialization.......................................

//
//		this is use for not making any bean of any class
	}

}
