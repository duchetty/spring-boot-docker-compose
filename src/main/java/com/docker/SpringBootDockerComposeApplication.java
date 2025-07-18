package com.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringBootDockerComposeApplication {
	
	

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerComposeApplication.class, args);
	}

}
