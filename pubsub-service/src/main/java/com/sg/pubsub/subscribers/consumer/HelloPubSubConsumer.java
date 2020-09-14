package com.sg.pubsub.subscribers.consumer;

import org.springframework.cloud.gcp.pubsub.support.BasicAcknowledgeablePubsubMessage;
import org.springframework.stereotype.Component;
import com.google.pubsub.v1.PubsubMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class HelloPubSubConsumer extends PubSubConsumer {
	private static final Logger LOGGER = LoggerFactory.getLogger(HelloPubSubConsumer.class);

	@Override
	public String subscription() {
		// nama subscriptionnya yang dibuat di/via google console
		return "hello-pubsub-subscription";
	}

	@Override
	protected void consume(BasicAcknowledgeablePubsubMessage acknowledgeablePubsubMessage) {
		// extract wrapped message
		PubsubMessage message = acknowledgeablePubsubMessage.getPubsubMessage();
		// process message
		LOGGER.info("message received: " + message.getData().toStringUtf8());

		// acknowledge that message was received
		acknowledgeablePubsubMessage.ack();
	}

}
