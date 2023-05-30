package com.jmsAssignment.demo.orderAcknowledgementApplication.Entity;

import java.io.Serializable;

public class OrderDetail {
    private Integer orderId;

    public OrderDetail(Integer orderId, String customerName, String email, String shippingAddress, Integer orderItems, Double totalAmount, String status) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.email = email;
        this.shippingAddress = shippingAddress;
        this.orderItems = orderItems;
        this.totalAmount = totalAmount;
        this.status = status;
    }
    public OrderDetail(){

    }

    private String customerName;
    private String email;
    private String shippingAddress;
    private Integer orderItems;
    private Double totalAmount;
    private String status;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Integer getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(Integer orderItems) {
        this.orderItems = orderItems;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "orderId=" + orderId +
                ", customerName='" + customerName + '\'' +
                ", email='" + email + '\'' +
                ", shippingAddress='" + shippingAddress + '\'' +
                ", orderItems=" + orderItems +
                ", totalAmount=" + totalAmount +
                ", status='" + status + '\'' +
                '}';
    }

}
