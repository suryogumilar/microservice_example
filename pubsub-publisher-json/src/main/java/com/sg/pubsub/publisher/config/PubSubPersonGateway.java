package com.sg.pubsub.publisher.config;

import org.springframework.integration.annotation.MessagingGateway;

import com.sg.pubsub.payload.Person;
@MessagingGateway(defaultRequestChannel = "pubSubOutputChannel")
public interface PubSubPersonGateway {
	void sendPersonToPubSub(Person person);
}
