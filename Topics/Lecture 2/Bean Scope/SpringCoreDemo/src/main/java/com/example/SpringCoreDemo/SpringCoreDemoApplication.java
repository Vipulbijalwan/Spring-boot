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


	//If we are not using @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) then we create the bean both locate to seme bean
//	public DemoController(@Qualifier("cricketCoach") Coach coach, @Qualifier("cricketCoach") Coach theanothercoach) {
//		this.coach = coach;
//		anothercoach=theanothercoach;
//	}//coach==anotherCoach==true
	//If we are  using @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) then we create the bean both locate to different bean
	// coach==anotherCoach==false
}
