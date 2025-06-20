package com.example.my_springboot_app;// adjust if your package name differs

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Hello, Spring Boot is working!";
    }
}

