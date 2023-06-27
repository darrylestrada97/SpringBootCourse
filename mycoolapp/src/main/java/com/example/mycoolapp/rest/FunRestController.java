package com.example.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    //Expose "/" that return "Hello World".
    @Value("${message}")
    public String message;

    @GetMapping("/")
    public String sayHello(){

        return message;
    }
    @GetMapping("/hello")
    public String sayHelloWorld(){

        return message;
    }

}
