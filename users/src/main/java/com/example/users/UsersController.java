package com.example.users;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UsersController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Olá, Spring Boot!";
    }
}