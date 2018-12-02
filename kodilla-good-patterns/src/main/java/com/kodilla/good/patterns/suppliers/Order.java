package com.kodilla.good.patterns.suppliers;

import java.time.LocalDateTime;

public final class Order {

    private final int orderNumber;
    private final int supplierId;
    private final Category category;
    private final int productId;
    private final double quantity;
    private final Unit unit;
    private final LocalDateTime orderDate;

    public Order(final int orderNumber, final int supplierId, final Category category, final int productId, final int quantity, final Unit unit, final LocalDateTime orderDate) {
        this.orderNumber = orderNumber;
        this.supplierId = supplierId;
        this.category = category;
        this.productId = productId;
        this.quantity = quantity;
        this.unit = unit;
        this.orderDate = orderDate;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public Category getCategory() {
        return category;
    }

    public int getProductId() {
        return productId;
    }

    public double getQuantity() {
        return quantity;
    }

    public Unit getUnit() {
        return unit;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }
}
