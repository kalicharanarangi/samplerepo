package com.skilllogic.productmanagement;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductmanagementApplication implements CommandLineRunner{

	@Value("${env.name}")
	private String name;
	
	public static void main(String[] args) {
		SpringApplication.run(ProductmanagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Environment Name : "+name);
	}
}
