package com.darryl.SpringCoreDemo.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements  Coach{
    public CricketCoach(){
        System.out.println("In constructor:" + getClass().getSimpleName());

    }


    //Define init method
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes. :-)";
    }
}
