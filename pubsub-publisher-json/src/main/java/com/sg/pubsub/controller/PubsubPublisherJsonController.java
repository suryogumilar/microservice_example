package com.sg.pubsub.controller;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sg.pubsub.payload.Person;
import com.sg.pubsub.publisher.config.PubSubPersonGateway;

@RestController
@RequestMapping("/publish")
public class PubsubPublisherJsonController {
	private static final Logger LOGGER = LoggerFactory.getLogger(PubsubPublisherJsonController.class);
	
	@Autowired
	private PubSubPersonGateway pubSubPersonGateway;

	public PubsubPublisherJsonController(PubSubPersonGateway pubSubPersonGateway) {
		this.pubSubPersonGateway = pubSubPersonGateway;
	}
	@PostMapping("/person")
	public void person(@RequestBody Person person) {
		if(person.getUid() == null) {
			person.setUid(UUID.randomUUID().toString());
		}
		LOGGER.info("received a POST at /publish/person with message=[{}]", person);
		this.pubSubPersonGateway.sendPersonToPubSub(person);
	}
}
