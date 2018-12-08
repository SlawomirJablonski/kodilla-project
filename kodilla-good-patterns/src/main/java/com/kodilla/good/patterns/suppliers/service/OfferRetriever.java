package com.kodilla.good.patterns.suppliers.service;

import com.kodilla.good.patterns.suppliers.ExtraFoodShop;
import com.kodilla.good.patterns.suppliers.Supplier;
import com.kodilla.good.patterns.suppliers.model.Offer;

public class OfferRetriever {

    public Offer retrieve(){

        Supplier supplier = new ExtraFoodShop();

        return supplier.createOffer();
    }
}
