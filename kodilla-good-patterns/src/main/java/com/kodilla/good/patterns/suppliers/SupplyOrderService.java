package com.kodilla.good.patterns.suppliers;

import java.time.LocalDateTime;
import java.util.ArrayList;

public final class SupplyOrderService {

    public Order createOrder(final Offer offer, final ShopDependency shopDependency) {

        int lastOrderNr = shopDependency.getLastOrderNumber();
        int newOrderNr = ++lastOrderNr;
        int supplierId = offer.getSupplier().getSupplierId();
        Category category = offer.getProduct().getCategory();
        int productId = offer.getProduct().getProductId();
        int quantity = shopDependency.getRequestedQuantity();
        Unit unit = offer.getProduct().getUnit();
        LocalDateTime orderDate = LocalDateTime.now();

        return new Order( newOrderNr,supplierId,category,productId,quantity,unit,orderDate);
    }

    public void addOrderToList(final Order order,final ShopDependency shopDependency){
        ArrayList<Order> currentOrderList = shopDependency.getOrdersList();
        currentOrderList.add(order);
        shopDependency.setOrdersList(currentOrderList);
        int newNumber = order.getOrderNumber();
        shopDependency.setLastOrderNumber(newNumber);
    }

    public void countBudget(final Offer offer,final Order order,final ShopDependency shopDependency){
        double oldBudget = shopDependency.getBudget();
        double itemPrice = offer.getProduct().getProductPrice();
        double quantity = order.getQuantity();
        double goodsCost = itemPrice*quantity;
        double newBudget = oldBudget - goodsCost;
        shopDependency.setBudget(newBudget);
    }
}
