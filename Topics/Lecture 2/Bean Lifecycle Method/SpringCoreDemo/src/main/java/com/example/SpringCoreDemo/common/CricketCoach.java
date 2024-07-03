package com.example.SpringCoreDemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component//make class spring bean
public class CricketCoach implements Coach {

    //define our init method
    @PostConstruct
    public void doMyStartup()
    {
        System.out.println("in DoMyStartup : " +getClass().getSimpleName());
    }
    //define our destroy  method
    @PreDestroy
    public void destroyStartup()
    {
        System.out.println("in DestroyStartup : "+getClass().getSimpleName());
    }
    @Override
    public String dailyWorkout() {
        return "15 MIN BOWLING PRACTICE...";
    }
}
