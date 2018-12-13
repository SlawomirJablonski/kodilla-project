package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;

public class OrderRepository {

    public ArrayList<Order> saveOrder(final Order order, final ArrayList<Order> orders) {

        orders.add(order);

        return orders;
    }
}
