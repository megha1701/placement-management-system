package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages ="com.example.controller,+ com.example.service")
public class Studentplacement5Application {

	public static void main(String[] args) {
		SpringApplication.run(Studentplacement5Application.class, args);
	}

}
