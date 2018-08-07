package com.test.security;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping(value = "/helloWorld")
    public String helloWorld() {
        return "Hello world " + System.currentTimeMillis();
    }
}
