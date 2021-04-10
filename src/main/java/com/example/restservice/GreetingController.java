package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {         // To input a name add "?name=INPUT" in the hyperlink
        return new Greeting(counter.incrementAndGet(), String .format(template, name));
    }

    @GetMapping("/greeting/{value}")
    public String customGreeting(@PathVariable(value = "value")String value){
        return "Hello " + value + " !!";
    }
}
