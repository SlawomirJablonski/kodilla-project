package com.kodilla.good.patterns.suppliers;

import java.time.LocalDateTime;

public class OfferRetriever {

    public Offer createOffer(){
        Supplier supplier = new Supplier("ExtraFoodShop",1245545457);
        Product product = new Product(Category.DRINKS,254,2.5,Unit.BOTTLE);
        LocalDateTime offerDate = LocalDateTime.of(2018,11,27,15,30);

        return new Offer(supplier,product,offerDate);
    }
}
