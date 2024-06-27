package com.example.NewSpringbootproject;

import org.springframework.stereotype.Controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController
@Controller

public class NewSpringbootprojectApplication {
	@GetMapping("/msg1")
	public String getMessage() {
		return "Hello....";
	}

	public static void main(String[] args) {
		SpringApplication.run(NewSpringbootprojectApplication.class, args);
	}

}
