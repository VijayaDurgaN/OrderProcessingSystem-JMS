package com.jmsAssignment.ShipmentTrackingApplication;

import com.jmsAssignment.orderAcknowledgementApplication.Entity.OrderDetail;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;



@Component
public class MyListener {
    private static final Logger logger =  LoggerFactory.getLogger(MyListener.class.toString());
    @JmsListener(destination = "${springjms.myQueue}")
    public void receive(OrderDetail orderDetail){
        logger.info("order received" + orderDetail);
    }
}
