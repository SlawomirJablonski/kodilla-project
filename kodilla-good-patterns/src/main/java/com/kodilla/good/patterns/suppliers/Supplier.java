package com.kodilla.good.patterns.suppliers;

public final class Supplier {
    private final String supplierName;
    private final int supplierId;

    public Supplier(final String supplierName, final int supplierId) {
        this.supplierName = supplierName;
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public int getSupplierId() {
        return supplierId;
    }
}
