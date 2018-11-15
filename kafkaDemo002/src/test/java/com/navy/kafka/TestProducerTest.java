package com.navy.kafka;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestProducerTest {
	
	@Autowired
	private TestProducer testProducer;
	
	@Test
	public void testSend() throws InterruptedException {
		String msg = "hello kitty hai shui.";
		testProducer.send(msg);
		Thread.sleep(60*1000);
	}
}
