package com.example.SpringCoreDemo.common;

import org.springframework.stereotype.Component;

@Component                    //make class spring bean
public class CricketCoach implements Coach {
    public CricketCoach() {
        System.out.println("In constructor :"+getClass().getSimpleName());
    }
    @Override
    public String dailyWorkout() {
        return "15 MIN BOWLING PRACTICE...";
    }
}
