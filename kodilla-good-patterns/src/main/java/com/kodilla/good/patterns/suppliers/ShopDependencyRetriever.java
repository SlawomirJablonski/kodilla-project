package com.kodilla.good.patterns.suppliers;

import java.util.ArrayList;

public class ShopDependencyRetriever {

    public ShopDependency retrieve(){

        double budget = 3000;
        int requestedQuantity = 100;
        int lastOrderNumber = 15447;
        ArrayList<Order> ordersList = new ArrayList<>();
        ArrayList<SupplierDto> supplierList = new ArrayList<>();

        ShopDependency shopDependency = new ShopDependency(budget,requestedQuantity,lastOrderNumber,ordersList,supplierList);
        return shopDependency;
    }
}
