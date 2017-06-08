package com.kafka.service;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		//		To Push messages to topic test_topic
//		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("camel-config.xml");

		//		To Consume messages from topic test_topic
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("camel-config-consumer.xml");

//				To send messages from test_topic to test_topic2
//		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("camel-config-topic2topic.xml");
	        ctx.start();
	        System.out.println("Application context started");
	        try {
	            Thread.sleep(5*60*1000);
	        }
	        catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        ctx.stop();
	        ctx.close();
	}
}
