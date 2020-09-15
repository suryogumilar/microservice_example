package com.sg.pubsub.publisher.config;

import org.springframework.cloud.gcp.pubsub.core.PubSubTemplate;
import org.springframework.cloud.gcp.pubsub.integration.outbound.PubSubMessageHandler;
import org.springframework.cloud.gcp.pubsub.support.converter.JacksonPubSubMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.messaging.MessageHandler;
import org.springframework.util.concurrent.ListenableFutureCallback;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sg.pubsub.payload.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


@Configuration
@IntegrationComponentScan("com.sg.pubsub.publisher.config")
public class PubsubPubsliherJsonConfig {
	private static final Log LOGGER = LogFactory.getLog(PubsubPubsliherJsonConfig.class);
	private static final String TOPIC_NAME = "hello-pubsub";
	@Bean
	public DirectChannel pubSubOutputChannel() {
		return new DirectChannel();
	}
	
	@Bean
	@ServiceActivator(inputChannel = "pubSubOutputChannel")
	public MessageHandler messageSender(PubSubTemplate pubSubTemplate) {
		PubSubMessageHandler adapter = new PubSubMessageHandler(pubSubTemplate, TOPIC_NAME);
		adapter.setPublishCallback(new ListenableFutureCallback<String>() {
			@Override
			public void onFailure(Throwable ex) {
				LOGGER.error("There was an error sending the message.");
			}

			@Override
			public void onSuccess(String result) {
				LOGGER.info("Message was sent successfully. result="+result);
			}
		});

		return adapter;
	}

	
}
