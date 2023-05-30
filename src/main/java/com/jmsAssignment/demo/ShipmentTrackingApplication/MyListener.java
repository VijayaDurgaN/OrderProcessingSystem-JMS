package com.jmsAssignment.demo.ShipmentTrackingApplication;

import com.jmsAssignment.demo.orderAcknowledgementApplication.Entity.OrderDetail;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;



@Component
public class MyListener {
    private static final Logger logger =  LoggerFactory.getLogger(MyListener.class.toString());
    @JmsListener(destination = "${springjms.myQueue}")
    public void receive(String orderDetail){
        logger.info("order received" + orderDetail);
        System.out.println("message received" + orderDetail.toString());
//        System.out.println(orderDetail.);
    }
}
