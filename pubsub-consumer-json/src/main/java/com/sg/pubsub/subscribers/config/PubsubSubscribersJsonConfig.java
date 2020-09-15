package com.sg.pubsub.subscribers.config;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.gcp.pubsub.core.PubSubTemplate;
import org.springframework.cloud.gcp.pubsub.integration.AckMode;
import org.springframework.cloud.gcp.pubsub.integration.inbound.PubSubInboundChannelAdapter;
import org.springframework.cloud.gcp.pubsub.support.converter.JacksonPubSubMessageConverter;
import org.springframework.context.annotation.Bean;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sg.pubsub.payload.Person;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.messaging.MessageChannel;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@Configuration
public class PubsubSubscribersJsonConfig {
	private static final Log LOGGER = LogFactory.getLog(PubsubSubscribersJsonConfig.class);

	private static final String SUBSCRIPTION_NAME = "hello-pubsub-subscription";
	
	@Bean
	public DirectChannel pubSubInputChannel() {
		return new DirectChannel();
	}
	@Bean
	public PubSubInboundChannelAdapter messageChannelAdapter(
			@Qualifier("pubSubInputChannel") MessageChannel inputChannel,
			PubSubTemplate pubSubTemplate) {
		LOGGER.info("message channel adapter called, create adapter for topic subscription");
		PubSubInboundChannelAdapter adapter = new PubSubInboundChannelAdapter(pubSubTemplate, SUBSCRIPTION_NAME);
		adapter.setOutputChannel(inputChannel);
		adapter.setAckMode(AckMode.MANUAL);
		adapter.setPayloadType(Person.class);
		return adapter;
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
