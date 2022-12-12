package com.praveen.jenkins.api;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class SpringJenkins1ApplicationTests {

	public static Logger LOGGER = LoggerFactory.getLogger(SpringJenkins1ApplicationTests.class);
	@Test
	void contextLoads() {
		LOGGER.info("Test Case Executing .....");
		assertEquals(true,true);
	}

}
