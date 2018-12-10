package com.kodilla.good.patterns.suppliers.model;


import com.kodilla.good.patterns.suppliers.model.Category;

import java.time.LocalDateTime;

public final class SupplierDto {

    private final int supplierId;
    private final Category category;
    private final LocalDateTime cooperationStartDate;

    public SupplierDto(int supplierId, Category category, LocalDateTime cooperationStartDate) {
        this.supplierId = supplierId;
        this.category = category;
        this.cooperationStartDate = cooperationStartDate;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public Category getCategory() {
        return category;
    }

    public LocalDateTime getCooperationStartDate() {
        return cooperationStartDate;
    }
}
