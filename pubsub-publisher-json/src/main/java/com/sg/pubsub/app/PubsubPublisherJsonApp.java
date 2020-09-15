package com.sg.pubsub.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gcp.pubsub.support.converter.JacksonPubSubMessageConverter;
import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication(scanBasePackages = {"com.sg"})
public class PubsubPublisherJsonApp {
	public static void main(String[] args) {
		SpringApplication.run(PubsubPublisherJsonApp.class, args);
	}
	/**
	 * This bean enables serialization/deserialization of Java objects to JSON allowing you
	 * utilize JSON message payloads in Cloud Pub/Sub.
	 * @param objectMapper the object mapper to use
	 * @return a Jackson message converter
	 */
	@Bean
	public JacksonPubSubMessageConverter jacksonPubSubMessageConverter(ObjectMapper objectMapper) {
		return new JacksonPubSubMessageConverter(objectMapper);
	}	
}
