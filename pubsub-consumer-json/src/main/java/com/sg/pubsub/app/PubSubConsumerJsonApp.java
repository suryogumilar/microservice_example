package com.sg.pubsub.app;
import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication(scanBasePackages = {"com.sg"})
public class PubSubConsumerJsonApp {
	public static void main(String[] args) throws IOException {
		SpringApplication.run(PubSubConsumerJsonApp.class, args);
	}
	
}
