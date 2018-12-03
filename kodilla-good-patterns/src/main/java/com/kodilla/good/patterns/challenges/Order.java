package com.kodilla.good.patterns.challenges;

public final class Order {
    public User user;
    public int orderId;
    public int goodsId;

    public Order(User user, int orderId, int goodsId) {
        this.user = user;
        this.orderId = orderId;
        this.goodsId = goodsId;
    }

    public User getUser() {
        return user;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getGoodsId() {
        return goodsId;
    }
}
