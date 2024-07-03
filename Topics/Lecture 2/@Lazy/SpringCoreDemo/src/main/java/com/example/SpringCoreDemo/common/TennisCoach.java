package com.example.SpringCoreDemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    public TennisCoach() {
        System.out.println("In constructor :"+getClass().getSimpleName());
    }
    @Override
    public String dailyWorkout() {
        return "Practice your spin";
    }
}
