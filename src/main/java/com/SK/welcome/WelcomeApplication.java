package com.SK.welcome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class WelcomeApplication {

	public static void main(String[] args) {
		SpringApplication.run(WelcomeApplication.class, args);
	}

	// GET welcome msg
	@GetMapping("/welcome")
	public ResponseEntity<String> getWelcomeMessage(){
		return ResponseEntity.status(HttpStatus.OK).body("Hello SK");

	}
}
