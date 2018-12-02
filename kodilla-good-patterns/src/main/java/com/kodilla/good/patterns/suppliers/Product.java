package com.kodilla.good.patterns.suppliers;

enum Category{FRUIT, VEGETABLES, DIARY_PRODUCTS, BREADS, SWEETS, MEAT, SPICES, DRINKS};
enum Unit{KILOGRAM, LITER, PIECE, BOX, BOTTLE}

public class Product {
    private final Category category;
    private final int productId;
    private final double productPrice;
    private final Unit unit;

    public Product(final Category category, final int productId, final double productPrice, final Unit unit) {
        this.category = category;
        this.productId = productId;
        this.productPrice = productPrice;
        this.unit = unit;
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
}
