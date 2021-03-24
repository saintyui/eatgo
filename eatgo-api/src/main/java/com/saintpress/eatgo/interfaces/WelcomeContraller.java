package com.saintpress.eatgo.interfaces;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeContraller {

    @GetMapping("/")
    public String hello(){
        return "Hello World!!!!!";
    }
}
