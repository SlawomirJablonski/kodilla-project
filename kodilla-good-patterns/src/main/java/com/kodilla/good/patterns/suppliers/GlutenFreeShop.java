package com.kodilla.good.patterns.suppliers;

import com.kodilla.good.patterns.suppliers.model.*;
import com.kodilla.good.patterns.suppliers.service.InfoService;
import com.kodilla.good.patterns.suppliers.service.SupplierRepository;
import com.kodilla.good.patterns.suppliers.service.SupplyOrderService;

import java.time.LocalDate;

public class GlutenFreeShop implements Supplier{

    private InfoService infoService;
    private SupplierRepository supplierRepository;

    public GlutenFreeShop(InfoService infoService,
            SupplierRepository supplierRepository) {
        this.infoService = infoService;
        this.supplierRepository = supplierRepository;
    }

    @Override
    public Order createOrder(Product product, int quantity) {
        return new Order(getSupplierId(), getSupplierName(), product, quantity);
    }

    @Override
    public void process(Order order) {
        supplierRepository.saveOrder(order);
        infoService.sendOrderConfirmation(order);
    }

    @Override
    public String getSupplierName(){
        return "GlutenFreeShop";
    }

    public int getSupplierId(){
        return 987654321;
    }
}
