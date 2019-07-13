package com.test.springboot.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.test")
@EnableJpaRepositories(basePackages = "com.test")
@EntityScan(basePackages = "com.test")
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}

