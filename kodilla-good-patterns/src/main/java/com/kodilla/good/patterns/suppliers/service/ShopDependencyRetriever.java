package com.kodilla.good.patterns.suppliers.service;

import com.kodilla.good.patterns.suppliers.model.Order;
import com.kodilla.good.patterns.suppliers.model.ShopDependency;
import com.kodilla.good.patterns.suppliers.model.SupplierDto;

import java.time.LocalDate;
import java.util.ArrayList;

public class ShopDependencyRetriever {

    public ShopDependency retrieve(){

        double budget = 3000;
        int requestedQuantity = 100;
        int lastOrderNumber = 15447;
        ArrayList<Order> ordersList = new ArrayList<>();
        ArrayList<SupplierDto> supplierList = new ArrayList<>();
        LocalDate expireDate = LocalDate.of(2019, 01, 30);
        String madeIn = "China";
        double additivePercentValue = 2;

        ShopDependency shopDependency = new ShopDependency(budget,requestedQuantity,lastOrderNumber,ordersList,supplierList,expireDate,madeIn,additivePercentValue);
        return shopDependency;
    }
}
