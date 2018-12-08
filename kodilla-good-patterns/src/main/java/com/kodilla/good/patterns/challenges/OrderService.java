package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderService {
    public boolean order(final User user, final Integer orderId, final LocalDateTime orderDate) {
        return user != null && orderId != null && orderDate != null;
    }
}
