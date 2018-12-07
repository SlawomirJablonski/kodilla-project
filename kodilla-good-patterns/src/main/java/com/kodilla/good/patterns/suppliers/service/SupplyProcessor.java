package com.kodilla.good.patterns.suppliers.service;

import com.kodilla.good.patterns.suppliers.model.ShopDependency;
import com.kodilla.good.patterns.suppliers.model.Offer;

public class SupplyProcessor {

    public void processingOffer(Offer offer, ShopDependency shopDependency){
        System.out.println("Shop is processing your offer "+ offer.getSupplier().getSupplierName());
        offer.getSupplier().process(offer,shopDependency);
    }
}
