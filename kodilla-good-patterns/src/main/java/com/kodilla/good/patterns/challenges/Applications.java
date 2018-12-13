package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;

public class Applications {
    public static void main(String[] args) {

        ArrayList<Order> orderList = new ArrayList<>();
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new InformationService(), new OrderService(), new OrderRepository());

        productOrderService.process(orderRequest, orderList);

    }
}
