package com.jmsAssignment.demo.orderAcknowledgementApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class orderAcknowledgementApplication {

	public static void main(String[] args) {
		SpringApplication.run(orderAcknowledgementApplication.class, args);
	}

}
