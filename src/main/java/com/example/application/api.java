package com.example.application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class api {
    @GetMapping("/hello")
    public String hello() {
        return "Hello...";
    }
}
