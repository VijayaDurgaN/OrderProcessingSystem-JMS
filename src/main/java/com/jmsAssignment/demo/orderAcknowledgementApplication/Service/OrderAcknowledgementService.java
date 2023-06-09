package com.jmsAssignment.demo.orderAcknowledgementApplication.Service;

import com.jmsAssignment.demo.orderAcknowledgementApplication.Entity.OrderDetail;
import com.jmsAssignment.demo.orderAcknowledgementApplication.MessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderAcknowledgementService {
    @Autowired
    public MessageSender messageSender;
    public void sendOrderDetail(OrderDetail orderDetail) {
        System.out.println(orderDetail);
        messageSender.send(orderDetail);

    }
}
