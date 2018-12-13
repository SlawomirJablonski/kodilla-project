package com.kodilla.good.patterns.suppliers;

import com.kodilla.good.patterns.suppliers.model.*;
import com.kodilla.good.patterns.suppliers.service.InfoService;
import com.kodilla.good.patterns.suppliers.service.SupplierRepository;
import com.kodilla.good.patterns.suppliers.service.SupplyOrderService;

import java.time.LocalDate;

public class HealthyShop implements Supplier{

    private InfoService infoService;
    private SupplyOrderService supplyOrderService;
    private SupplierRepository supplierRepository;

    public HealthyShop(InfoService infoService, SupplyOrderService supplyOrderService, SupplierRepository supplierRepository) {
        this.infoService = infoService;
        this.supplyOrderService = supplyOrderService;
        this.supplierRepository = supplierRepository;
    }

    @Override
    public Offer createOffer(){
        return new Offer(new HealthyShop(new InfoService(),new SupplyOrderService(),new SupplierRepository()),new Product(Category.MEAT,24637,95, Unit.KILOGRAM, LocalDate.of(2019, 01, 12),"Poland",0));
    }

    @Override
    public void process(Offer offer, ShopDependency shopDependency){

        double goodsAdditivePercent = offer.getProduct().getAdditivePercentValue();
        double maxAdditivePercent = shopDependency.getAdditivePercentValue();
        double budget = shopDependency.getBudget();
        int quantity = shopDependency.getRequestedQuantity();
        double unitPrice = offer.getProduct().getProductPrice();
        double goodsCost = quantity * unitPrice;
        String currentSupplierName = offer.getSupplier().getSupplierName();


        if (goodsAdditivePercent<maxAdditivePercent && goodsCost<=budget){
            Order order = supplyOrderService.createOrder(offer,shopDependency);
            supplyOrderService.addOrderToList(order,shopDependency);
            supplyOrderService.countBudget(offer,order,shopDependency);
            infoService.sendOrderConfirmation(offer,order);
            SupplierDto newSupplierDto = supplierRepository.createSupplierDto(order);
            supplierRepository.addSupplierDto(shopDependency,newSupplierDto);
        }else {
            System.out.println("Need price negotiations with "+currentSupplierName);
        }
    }

    @Override
    public String getSupplierName(){
        return "HealthyShop";
    }

    public int getSupplierId(){
        return 222333444;
    }
}
