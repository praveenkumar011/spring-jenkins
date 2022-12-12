package com.praveen.jenkins.api;

import jakarta.annotation.PostConstruct;
//import javax.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkins1Application {

	public static Logger LOGGER = LoggerFactory.getLogger(SpringJenkins1Application.class);

	public static void main(String[] args) {
		LOGGER.info("Application executed......");
		SpringApplication.run(SpringJenkins1Application.class, args);
	}

	@PostConstruct
	public void init()
	{
		LOGGER.info("Application Started");
	}

}
