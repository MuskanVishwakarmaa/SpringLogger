package com.example.springlog;

import com.example.springlog.component.DemoBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication

public class SpringLoggerApplication {

	public static void main(String[] args) {
		System.out.println("Welcome to Spring Concept");
		ApplicationContext context = SpringApplication.run(SpringLoggerApplication.class, args);
		System.out.println("Checking Context: " + context.getBean(DemoBean.class));
	}

}
