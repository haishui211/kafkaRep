package com.navy.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class TestProducer {
	
	private static final String TEST_POIC = "demo002";
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	public void send(String msg) {
		kafkaTemplate.send(TEST_POIC, msg);
	}
}
