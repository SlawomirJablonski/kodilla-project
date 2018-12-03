package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;

public class ProductOrderService {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(final InformationService informationService,
                               final OrderService orderService,
                               final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public void process(final OrderRequest orderRequest, ArrayList<Order> orderList){

        Order order = orderService.createOrder(orderRequest);
        informationService.inform(order.getUser());
        ArrayList<Order> listOfOrders = orderRepository.saveOrder(order, orderList);

        System.out.println(listOfOrders.get(0).getOrderId());

    }
}

