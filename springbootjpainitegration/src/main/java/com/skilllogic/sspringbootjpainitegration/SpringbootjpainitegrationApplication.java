package com.skilllogic.sspringbootjpainitegration;

import java.io.Serializable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootjpainitegrationApplication implements Serializable{

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootjpainitegrationApplication.class, args);
	}

}
