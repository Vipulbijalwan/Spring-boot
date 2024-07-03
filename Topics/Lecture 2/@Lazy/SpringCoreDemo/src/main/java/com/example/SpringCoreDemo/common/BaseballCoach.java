package com.example.SpringCoreDemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BaseballCoach implements Coach{

    public BaseballCoach() {
        System.out.println("In constructor :"+getClass().getSimpleName());
    }

    @Override
    public String dailyWorkout() {
        return "spend 30 min in baseball";
    }
}
