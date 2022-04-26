package com.example.jsppractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.jsppractice")
public class JspPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(JspPracticeApplication.class, args);
	}

}
