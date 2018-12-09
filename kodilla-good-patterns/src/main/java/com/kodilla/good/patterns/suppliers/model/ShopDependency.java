package com.kodilla.good.patterns.suppliers.model;

import java.time.LocalDate;
import java.util.ArrayList;

public final class ShopDependency {

    private double budget;
    private int requestedQuantity;
    private int lastOrderNumber;
    private ArrayList<Order> ordersList;
    private ArrayList<SupplierDto> supplierList;
    private LocalDate expireDate;
    private String madeIn;
    private double additivePercentValue;

    public ShopDependency(final double budget, final int requestedQuantity, final int lastOrderNumber, final ArrayList<Order> ordersList, final ArrayList<SupplierDto> supplierList, final LocalDate expireDate, final String madeIn, final double additivePercentValue) {
        this.budget = budget;
        this.requestedQuantity = requestedQuantity;
        this.lastOrderNumber = lastOrderNumber;
        this.ordersList = ordersList;
        this.supplierList = supplierList;
        this.expireDate = expireDate;
        this.madeIn = madeIn;
        this.additivePercentValue = additivePercentValue;
    }

    public double getBudget() {
        return budget;
    }

    public int getRequestedQuantity() {
        return requestedQuantity;
    }

    public int getLastOrderNumber() {
        return lastOrderNumber;
    }

    public ArrayList<Order> getOrdersList() {
        return ordersList;
    }

    public ArrayList<SupplierDto> getSupplierList() {
        return supplierList;
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

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public void setRequestedQuantity(int requestedQuantity) {
        this.requestedQuantity = requestedQuantity;
    }

    public void setLastOrderNumber(int lastOrderNumber) {
        this.lastOrderNumber = lastOrderNumber;
    }

    public void setOrdersList(ArrayList<Order> ordersList) {
        this.ordersList = ordersList;
    }

    public void setSupplierList(ArrayList<SupplierDto> supplierList) {
        this.supplierList = supplierList;
    }

    public void setExpireDate(LocalDate expireDate) {
        this.expireDate = expireDate;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    public void setAdditivePercentValue(double additivePercentValue) {
        this.additivePercentValue = additivePercentValue;
    }
}
