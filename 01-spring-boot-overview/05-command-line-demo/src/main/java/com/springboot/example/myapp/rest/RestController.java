package com.springboot.example.myapp.rest;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    // expose "/" that return "Hello World" ;
    @GetMapping
    public String sayHello(){
        return "Hello World!";
    }
    // expose a new endpoint "Work Out"
    @GetMapping("/workout")
    public String getWorkOut(){
        return "Run 100 miles a day";
    }

    // expose a new endpoint("Fortune")
    @GetMapping("/fortune")
    public String getFortune(){
        return "Today is a lucky day!";
    }
}
