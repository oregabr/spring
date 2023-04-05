package com.example.argocd_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ArgocdDemoApplication {

	public static void main(String[] args) {
		System.out.println("START");
		SpringApplication.run(ArgocdDemoApplication.class, args);
	}

}
