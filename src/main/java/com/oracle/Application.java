package com.oracle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;

//http://localhost:9095

@SpringBootApplication

public class Application extends SpringBootServletInitializer{

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		

	}
}
