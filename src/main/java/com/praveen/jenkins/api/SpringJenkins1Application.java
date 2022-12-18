package com.praveen.jenkins.api;

import jakarta.annotation.PostConstruct;
//import javax.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
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

	@GetMapping("/message")
	public String displayMessage()
	{
		return "Congratulation you successfully deployed your applicaiton to kubernetes";
	}

}
