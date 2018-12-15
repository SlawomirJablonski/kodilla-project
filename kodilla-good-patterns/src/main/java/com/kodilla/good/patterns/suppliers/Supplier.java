package com.kodilla.good.patterns.suppliers;

import com.kodilla.good.patterns.suppliers.model.Order;
import com.kodilla.good.patterns.suppliers.model.Product;

public interface Supplier {

    Order createOrder(Product product, int quantity);

    void process(Order order);

    String getSupplierName();

    int getSupplierId();
}
