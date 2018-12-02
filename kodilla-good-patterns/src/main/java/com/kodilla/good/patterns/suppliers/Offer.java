package com.kodilla.good.patterns.suppliers;

import java.time.LocalDateTime;

public final class Offer {
    private final Supplier supplier;
    private final Product product;
    private final LocalDateTime offerDate;

    public Offer(final Supplier supplier, final Product product, final LocalDateTime offerDate) {
        this.supplier = supplier;
        this.product = product;
        this.offerDate = offerDate;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDateTime getOfferDate() {
        return offerDate;
    }
}
