package com.jmsAssignment.orderAcknowledgementApplication;

import com.jmsAssignment.orderAcknowledgementApplication.Entity.OrderDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Value("${springjms.myQueue}")
    private String queue;

    public void send(OrderDetail message){
        jmsTemplate.convertAndSend(queue,message);
    }
}
