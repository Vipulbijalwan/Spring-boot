package com.example.SpringCoreDemo.Common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    @Override
    public String dailyWorkout() {
        return "15 MIN BOWLING PRACTICE...";
    }
}
