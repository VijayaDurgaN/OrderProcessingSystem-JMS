package com.jmsAssignment.demo.orderAcknowledgementApplication.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem implements Serializable {
    private int productId;
    private String productName;
    private double unitPrice;
    private int quantity;
    private double subtotal;
}
