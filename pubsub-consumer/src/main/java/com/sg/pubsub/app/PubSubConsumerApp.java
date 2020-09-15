package com.sg.pubsub.app;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication(scanBasePackages = {"com.sg"})
public class PubSubConsumerApp {
	public static void main(String[] args) throws IOException {
		SpringApplication.run(PubSubConsumerApp.class, args);
		System.out.println("Hit 'Enter' to terminate");
		System.in.read();
	}
}
