package com.darryl.SpringCoreDemo.config;

import com.darryl.SpringCoreDemo.common.Coach;
import com.darryl.SpringCoreDemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig
{

    @Bean("aquatic")
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
