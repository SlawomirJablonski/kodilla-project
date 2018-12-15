package com.kodilla.good.patterns.suppliers.model;

import java.time.LocalDateTime;
import java.util.UUID;

public final class Order {

    private final UUID orderNumber;
    private final int supplierId;
    private final Product product;
    private final double quantity;
    private final LocalDateTime orderDate;
    private final String supplierName;

    public Order(int supplierId, String supplierName, Product product, int quantity) {
        this.orderNumber = UUID.randomUUID();
        this.orderDate = LocalDateTime.now();
        this.supplierId = supplierId;
        this.product = product;
        this.quantity = quantity;
        this.supplierName = supplierName;
    }

    public UUID getOrderNumber() {
        return orderNumber;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public double getQuantity() {
        return quantity;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public Product getProduct() {
        return product;
    }

    public String getSupplierName() {
        return supplierName;
    }
}
