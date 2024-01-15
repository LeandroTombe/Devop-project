package com.devops.example;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@Slf4j
class ExampleApplicationTests {


	@Test
	void contextLoads() {
		log.info("it's test about continuous integration");
        assertTrue(true);
	}

}
