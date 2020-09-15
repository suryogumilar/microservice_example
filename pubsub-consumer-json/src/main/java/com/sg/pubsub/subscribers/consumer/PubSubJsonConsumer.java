package com.sg.pubsub.subscribers.consumer;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Component;
import org.springframework.cloud.gcp.pubsub.support.GcpPubSubHeaders;
import org.springframework.cloud.gcp.pubsub.support.BasicAcknowledgeablePubsubMessage;
import com.sg.pubsub.payload.Person;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
@Component
public class PubSubJsonConsumer {
	private static final Log LOGGER = LogFactory.getLog(PubSubJsonConsumer.class);

	@ServiceActivator(inputChannel = "pubSubInputChannel")
	public void messageReceiver(Person payload,
			@Header(GcpPubSubHeaders.ORIGINAL_MESSAGE) BasicAcknowledgeablePubsubMessage message) {
		LOGGER.info("Message arrived! Payload: " + payload);
		message.ack();
	}
}
