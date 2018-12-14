package com.kodilla.good.patterns.suppliers;

import com.kodilla.good.patterns.suppliers.model.Offer;
import com.kodilla.good.patterns.suppliers.model.ShopDependency;
import com.kodilla.good.patterns.suppliers.service.OfferRetriever;
import com.kodilla.good.patterns.suppliers.service.ShopDependencyRetriever;
import com.kodilla.good.patterns.suppliers.service.SupplyProcessor;

public class Application {
    public static void main(String[] args){

        ShopDependencyRetriever shopDependencyRetriever = new ShopDependencyRetriever();
        ShopDependency shopDependency = shopDependencyRetriever.retrieve();

        OfferRetriever offerRetriever = new OfferRetriever();
        Offer offer = offerRetriever.retrieve();

        SupplyProcessor supplyProcessor = new SupplyProcessor();
        supplyProcessor.processingOffer(offer,shopDependency);
    }
}
