package com.kodilla.good.patterns.suppliers.model;

import java.time.LocalDate;

public class Product {
    private final Category category;
    private final int productId;
    private final double productPrice;
    private final Unit unit;
    private final LocalDate expireDate;
    private final String madeIn;
    private final double additivePercentValue;

    public Product(final Category category, final int productId, final double productPrice, final Unit unit, final LocalDate expireDate, final String madeIn, final double additivePercentValue) {
        this.category = category;
        this.productId = productId;
        this.productPrice = productPrice;
        this.unit = unit;
        this.expireDate = expireDate;
        this.madeIn = madeIn;
        this.additivePercentValue = additivePercentValue;
    }

    public Category getCategory() {
        return category;
    }

    public int getProductId() {
        return productId;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public Unit getUnit() {
        return unit;
    }

    public LocalDate getExpireDate() {
        return expireDate;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public double getAdditivePercentValue() {
        return additivePercentValue;
    }
}
