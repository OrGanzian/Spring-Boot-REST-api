package com.organ.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



/*
"scanBasePackages" is added to scanning all the specified path
 */
@SpringBootApplication(scanBasePackages= "com.organ")
public class OrApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrApplication.class, args);
	}

}
