package com.cafe.cafetdd.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class CafeTddApplication {

	public static void main(String[] args) {
		SpringApplication.run(CafeTddApplication.class, args);
	}

}
