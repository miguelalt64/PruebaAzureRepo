package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class AzureApplication {
	
	@GetMapping("/mensaje")
	@ResponseStatus(HttpStatus.OK)
	public String getProfesores(){
		return "Hola Mundo Azure";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(AzureApplication.class, args);
	}

}
