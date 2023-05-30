package com.jmsAssignment.orderAcknowledgementApplication.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetail implements Serializable {
    private Integer orderId;
    private String customerName;
    private String email;
    private String shippingAddress;
    private List<OrderItem> orderItems;
    private Double totalAmount;

    private LocalDate orderDate;
    private OrderStatus status;


    @Override
    public String toString() {
        return "OrderDetail{" +
                "orderId=" + orderId +
                ", customerName='" + customerName + '\'' +
                ", email='" + email + '\'' +
                ", shippingAddress='" + shippingAddress + '\'' +
                ", orderItems=" + orderItems +
                ", totalAmount=" + totalAmount +
                ", orderDate=" + orderDate +
                ", status=" + status +
                '}';
    }
}
