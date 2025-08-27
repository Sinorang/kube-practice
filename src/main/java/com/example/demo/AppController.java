package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @GetMapping("/")
    public String home() {
        System.out.println("Hello World!"); // 추후 디버깅용
        return "Hello World!";
    }
}
