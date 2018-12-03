package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public final class OrderRequest {
    private User user;
    private int productId;
    private LocalDateTime orderDate;

    public OrderRequest(final User user,final int productId,final LocalDateTime orderDate) {
        this.user = user;
        this.productId = productId;
        this.orderDate = orderDate;
    }

    public User getUser() {
        return user;
    }

    public int getProductId() {
        return productId;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }
}
