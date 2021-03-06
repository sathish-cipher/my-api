package com.api.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages={"com"})
@ComponentScan("com")
public class MyApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyApiApplication.class, args);
	}

}
