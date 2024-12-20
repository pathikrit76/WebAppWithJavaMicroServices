package com.tutorial.webappdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class WebappdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebappdemoApplication.class, args);
	}

}
