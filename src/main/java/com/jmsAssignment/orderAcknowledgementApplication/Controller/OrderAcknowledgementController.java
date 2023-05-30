package com.jmsAssignment.orderAcknowledgementApplication.Controller;

import com.jmsAssignment.orderAcknowledgementApplication.Entity.OrderDetail;
import com.jmsAssignment.orderAcknowledgementApplication.Service.OrderAcknowledgementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderAcknowledgementController {

    @Autowired
    OrderAcknowledgementService orderAcknowledgementService;

    @PostMapping("/orders/add")
    public String addOrderDetails(@RequestBody OrderDetail orderDetail){
        orderAcknowledgementService.sendOrderDetail(orderDetail);
        String successMessage = "INSERT_SUCCESS" ;
        return successMessage;

    }
}
