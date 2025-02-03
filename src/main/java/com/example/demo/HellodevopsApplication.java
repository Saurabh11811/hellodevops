package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HellodevopsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HellodevopsApplication.class, args);
	}

}

@RestController
@RequestMapping("/")
class HelloWorldController {
    @GetMapping
    public String sayHello() {
        return "Hello, World! DevOps CI/CD on Saurabh!";
    }
}
