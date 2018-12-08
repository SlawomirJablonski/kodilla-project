package com.kodilla.good.patterns.suppliers.model;

import com.kodilla.good.patterns.suppliers.Supplier;

public final class Offer {
    private final Supplier supplier;
    private final Product product;


    public Offer(final Supplier supplier, final Product product) {
        this.supplier = supplier;
        this.product = product;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Product getProduct() {
        return product;
    }
}
