package com.kodilla.good.patterns.suppliers.service;

import com.kodilla.good.patterns.suppliers.model.Offer;
import com.kodilla.good.patterns.suppliers.model.Order;
import com.kodilla.good.patterns.suppliers.model.Unit;


public final class InfoService {
    public void sendOrderConfirmation(final Offer offer, final Order order){

        String supplier = offer.getSupplier().getSupplierName();
        int goodsId = offer.getProduct().getProductId();
        int orderNr = order.getOrderNumber();
        double quantity = order.getQuantity();
        Unit unit = order.getUnit();

        System.out.println("Dear Supplier "+supplier+"\n"+
                "Company Food2Door confirm order for supply goods: "+goodsId+", in quantity: "+quantity+" "+unit+"\n"+
                "order number: "+orderNr);
    }
}
