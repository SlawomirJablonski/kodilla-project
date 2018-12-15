package com.kodilla.good.patterns.suppliers.service;

import com.kodilla.good.patterns.suppliers.model.Order;
import com.kodilla.good.patterns.suppliers.model.Unit;

import java.util.UUID;

public final class InfoService {
    public void sendOrderConfirmation(final Order order){

        String supplierName = order.getSupplierName();
        int goodsId = order.getProduct().getProductId();
        UUID orderNr = order.getOrderNumber();
        double quantity = order.getQuantity();

        System.out.println("Dear Supplier "+ supplierName+"\n"+
                "Company Food2Door confirm order for supply goods: "+goodsId+", in quantity: "+quantity+
                "order number: "+orderNr);
    }
}
