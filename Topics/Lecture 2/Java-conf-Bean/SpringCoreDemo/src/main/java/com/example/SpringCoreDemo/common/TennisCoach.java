package com.example.SpringCoreDemo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    @Override
    public String dailyWorkout() {
        return "Practice your spin";
    }
}
