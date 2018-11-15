package com.navy.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class TestConsumer {
	
	@KafkaListener(topics = "demo002")
	public void processMessage(String content) {
		System.out.println("receive a msg: " + content);
	}
}
