package com.example.demo;

import org.apache.log4j.PropertyConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
class DemoApplication {

	public static void main(String[] args) {

		PropertyConfigurator.configure("log4.properties");
		SpringApplication.run(DemoApplication.class, args);
	}

}
