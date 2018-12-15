package com.kodilla.good.patterns.suppliers.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Shop {

    private double budget;
    private int requestedQuantity;
    private List<Order> ordersList;
    private LocalDate expireDate;
    private String madeIn;
    private double additivePercentValue;

    public Shop(final double budget, final int requestedQuantity,
            final List<Order> ordersList, final LocalDate expireDate,
            final String madeIn, final double additivePercentValue) {
        this.budget = budget;
        this.requestedQuantity = requestedQuantity;
        this.ordersList = ordersList;
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


    public List<Order> getOrdersList() {
        return ordersList;
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


    public void setOrdersList(ArrayList<Order> ordersList) {
        this.ordersList = ordersList;
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
