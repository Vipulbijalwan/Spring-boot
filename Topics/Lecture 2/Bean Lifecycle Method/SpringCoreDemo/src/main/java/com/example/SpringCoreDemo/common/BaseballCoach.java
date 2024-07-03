package com.example.SpringCoreDemo.common;

import org.springframework.stereotype.Component;

@Component//always use @component
public class BaseballCoach implements Coach{
    @Override
    public String dailyWorkout() {
        return "spend 30 min in baseball";
    }
}
