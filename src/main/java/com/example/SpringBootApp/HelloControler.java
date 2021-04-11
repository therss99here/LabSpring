package com.example.SpringBootApp;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {
    @RequestMapping("/")
    public String index(){
        return "Hello from the Spring Boot..";
    }
}
