package com.example.Circular_dependency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CircularDependencyApplication {

	public static void main(String[] args) {

		SpringApplication.run(CircularDependencyApplication.class, args);
		System.out.println("========= APPLICATION IS RUNNING ===========");
	}

}
