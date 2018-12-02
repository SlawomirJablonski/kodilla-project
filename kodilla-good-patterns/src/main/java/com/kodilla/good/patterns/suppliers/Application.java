package com.kodilla.good.patterns.suppliers;

public class Application {
    public static void main(String[] args){

        OfferRetriever offerRetriever = new OfferRetriever();
        Offer offer = offerRetriever.createOffer();

        ShopDependencyRetriever shopDependencyRetriever = new ShopDependencyRetriever();
        ShopDependency shopDependency = shopDependencyRetriever.retrieve();

        SupplyProcessor supplyProcessor = new SupplyProcessor(new InfoService(),new SupplyOrderService(),new SupplierRepository());
        supplyProcessor.process(offer,shopDependency);
    }
}
