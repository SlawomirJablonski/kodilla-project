package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRepository {

    public boolean createOrder(final User user, final Integer orderId, final LocalDateTime orderDate) {

        System.out.println("order number " + orderId + " made by " + user.getName() + " " + user.getSurname() + ", date of order: " + orderDate.toString());

        return true;
    }
}
