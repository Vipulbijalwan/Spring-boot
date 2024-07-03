package com.example.SpringCoreDemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component//always use @component
@Primary//this is a primary bean//you can't use more than one @primary
public class BaseballCoach implements Coach{
    @Override
    public String dailyWorkout() {
        return "spend 30 min in baseball";
    }
}
