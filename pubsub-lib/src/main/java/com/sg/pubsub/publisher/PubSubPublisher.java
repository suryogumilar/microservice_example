package com.sg.pubsub.publisher;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gcp.pubsub.core.PubSubTemplate;

public abstract class PubSubPublisher {
	private static final Logger LOGGER = LoggerFactory.getLogger(PubSubPublisher.class);

	private final PubSubTemplate pubSubTemplate;

	protected PubSubPublisher(PubSubTemplate pubSubTemplate) {
		this.pubSubTemplate = pubSubTemplate;
	}

	protected abstract String topic();

	public void publish(String message) {
		LOGGER.info("publishing to topic [{}], message: [{}]", topic(), message);
		pubSubTemplate.publish(topic(), message);
	}

}
