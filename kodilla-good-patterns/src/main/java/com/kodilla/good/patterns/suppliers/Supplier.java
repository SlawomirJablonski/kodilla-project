package com.kodilla.good.patterns.suppliers;

import com.kodilla.good.patterns.suppliers.model.Offer;
import com.kodilla.good.patterns.suppliers.model.ShopDependency;
import com.kodilla.good.patterns.suppliers.service.InfoService;
import com.kodilla.good.patterns.suppliers.service.SupplierRepository;
import com.kodilla.good.patterns.suppliers.service.SupplyOrderService;

public interface Supplier {

    Offer createOffer();

    void process(Offer offer, ShopDependency shopDependency);

    String getSupplierName();

    int getSupplierId();
}
