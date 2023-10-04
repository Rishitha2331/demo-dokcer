package com.example.demodocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoDockerApplication {

	@GetMapping("/getMessage")
	public String displayMessage(){
		return "Project Application running on Dockerfile container";
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoDockerApplication.class, args);
	}

}
