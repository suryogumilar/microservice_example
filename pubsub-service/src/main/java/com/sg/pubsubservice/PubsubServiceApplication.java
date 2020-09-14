package com.sg.pubsubservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.sg"})
public class PubsubServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PubsubServiceApplication.class, args);
	}

}
