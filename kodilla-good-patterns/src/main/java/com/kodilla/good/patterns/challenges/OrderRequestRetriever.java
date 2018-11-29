package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {
    public OrderRequest retrieve(){

        User user = new User("Marcin","Prokop");
        Integer orderId = 12126515;
        LocalDateTime orderDate = LocalDateTime.of(2018,11,27,15,30);

        return new OrderRequest(user,orderId,orderDate);
    }
}
