package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderService {

    public Order createOrder(final OrderRequest orderRequest) {

        LocalDateTime now = LocalDateTime.now();
        int a = now.getMonthValue() * 100000000;
        int b = now.getDayOfMonth() * 1000000;
        int c = now.getHour() * 10000;
        int d = now.getMinute() * 100;
        int e = now.getSecond();
        int orderId = a + b + c + d + e;
        int goodNr = orderRequest.getProductId();

        return new Order(orderRequest.getUser(), orderId, goodNr);
    }
}


