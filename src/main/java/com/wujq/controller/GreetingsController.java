package com.wujq.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wujq.model.Greeting;

@RestController
@RequestMapping("/api/")
public class GreetingsController {

    @RequestMapping("/")
    public String welcome() {//Welcome page, non-rest
        return "Welcome to my blog app";
    }

    @RequestMapping("/hello")
    public Greeting greet() {//REST Endpoint.

        Greeting msg = new Greeting();
        return msg;
    }

    @RequestMapping("/hello/{name}")
    public Greeting greetWithName(@PathVariable String name) {//REST Endpoint.

        Greeting msg = new Greeting(name);
        return msg;
    }
}
