package com.jmsAssignment.demo.orderAcknowledgementApplication.Controller;

import com.jmsAssignment.demo.orderAcknowledgementApplication.Entity.OrderDetail;
import com.jmsAssignment.demo.orderAcknowledgementApplication.Service.OrderAcknowledgementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class orderAcknowledgementController {

    @Autowired
    OrderAcknowledgementService orderAcknowledgementService;

    @PostMapping("/orderDetails/send")
    public String addOrderDetails(OrderDetail orderDetail){
//        OrderDetail orderDetail1 = new OrderDetail(1,"anme","email","address",1,100.0,"DONE");

        orderAcknowledgementService.sendOrderDetail(orderDetail);
        String successMessage = "INSERT_SUCCESS" ;
        return successMessage;

    }
}
