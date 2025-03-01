package com.example.springlog;

import com.example.springlog.component.DemoBean;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication

public class SpringLoggerApplication {

	public static final Logger logger = LoggerFactory.getLogger(SpringLoggerApplication.class);

	public static void main(String[] args) {
		logger.debug("Welcome to spring concept");
		ApplicationContext context = SpringApplication.run(SpringLoggerApplication.class, args);
		logger.debug("Checking Context: {}", context.getBean(DemoBean.class));
		logger.debug("\n*** Example using @Autowire annotation on property ***");
	}

}
