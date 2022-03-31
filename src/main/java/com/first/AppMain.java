package com.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController("")
@SpringBootApplication
public class AppMain {

    public static void main(String[] args) {
        SpringApplication.run(AppMain.class);
    }

    @GetMapping("/test")
    public String test () {
        LocalDateTime now = LocalDateTime.now();
        return "Hello Spring Boot! main " + now;
    }
}
