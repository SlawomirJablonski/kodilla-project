package com.kodilla.good.patterns.suppliers;

import java.util.ArrayList;

public final class ShopDependency {

    private double budget;
    private int requestedQuantity;
    private int lastOrderNumber;
    private ArrayList<Order> ordersList;
    private ArrayList<SupplierDto> supplierList;

    public ShopDependency(final double budget, final int requestedQuantity, final int lastOrderNumber, final ArrayList<Order> ordersList, final ArrayList<SupplierDto> supplierList) {
        this.budget = budget;
        this.requestedQuantity = requestedQuantity;
        this.lastOrderNumber = lastOrderNumber;
        this.ordersList = ordersList;
        this.supplierList = supplierList;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public int getRequestedQuantity() {
        return requestedQuantity;
    }

    public void setRequestedQuantity(int requestedQuantity) {
        this.requestedQuantity = requestedQuantity;
    }

    public int getLastOrderNumber() {
        return lastOrderNumber;
    }

    public void setLastOrderNumber(int lastOrderNumber) {
        this.lastOrderNumber = lastOrderNumber;
    }

    public ArrayList<Order> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(ArrayList<Order> ordersList) {
        this.ordersList = ordersList;
    }

    public ArrayList<SupplierDto> getSupplierList() {
        return supplierList;
    }

    public void setSupplierList(ArrayList<SupplierDto> supplierList) {
        this.supplierList = supplierList;
    }
}
