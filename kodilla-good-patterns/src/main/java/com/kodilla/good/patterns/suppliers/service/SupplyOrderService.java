package com.kodilla.good.patterns.suppliers.service;

import com.kodilla.good.patterns.suppliers.model.*;

public final class SupplyOrderService {

    private final Shop shopDependency;

    public SupplyOrderService(Shop shopDependency) {
        this.shopDependency = shopDependency;
    }

    public void countBudget(final Order order){
        double oldBudget = shopDependency.getBudget();
        double itemPrice = order.getProduct().getProductPrice();
        double quantity = order.getQuantity();
        double goodsCost = itemPrice*quantity;
        double newBudget = oldBudget - goodsCost;
        shopDependency.setBudget(newBudget);
    }
}
