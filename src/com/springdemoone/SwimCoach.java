package com.springdemoone;

public class SwimCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Swim 10 kilometers";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
