package com.kodilla.good.patterns.suppliers.service;

import com.kodilla.good.patterns.suppliers.model.Order;

public interface SupplierRepository {

    //saving order to db
    void saveOrder(Order order);
}
