package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {
    private User user;
    private int orderId;
    private LocalDateTime orderDate;

    public OrderRequest(User user, int orderId, LocalDateTime orderDate) {
        this.user = user;
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public User getUser() {
        return user;
    }

    public int getOrderId() {
        return orderId;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }
}
