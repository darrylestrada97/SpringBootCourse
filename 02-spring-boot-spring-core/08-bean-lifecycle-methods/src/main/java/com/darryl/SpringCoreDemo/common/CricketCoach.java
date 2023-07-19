package com.darryl.SpringCoreDemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements  Coach{
    public CricketCoach(){
        System.out.println("In constructor:" + getClass().getSimpleName());

    }


    //Define init method

    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("In doMystartupStuff: "+getClass().getSimpleName());
    }

    //Define destroy method
    @PreDestroy
    public  void  doMyCleanupStuff(){
        System.out.println("In cleanupStuff"+ getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes. :-)";
    }
}
