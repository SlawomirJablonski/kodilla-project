package com.kodilla.good.patterns.suppliers;

import com.kodilla.good.patterns.suppliers.model.*;
import com.kodilla.good.patterns.suppliers.service.InfoService;
import com.kodilla.good.patterns.suppliers.service.SupplierRepository;
import com.kodilla.good.patterns.suppliers.service.SupplyOrderService;

import java.time.LocalDate;

public class ExtraFoodShop implements Supplier {

    //konstruktor z moimi starymi interfejsami
    private InfoService infoService;
    private SupplyOrderService supplyOrderService;
    private SupplierRepository supplierRepository;


    public ExtraFoodShop(InfoService infoService, SupplyOrderService supplyOrderService, SupplierRepository supplierRepository) {
        this.infoService = infoService;
        this.supplyOrderService = supplyOrderService;
        this.supplierRepository = supplierRepository;
    }

    @Override
    public Offer createOffer(){
        return new Offer(new ExtraFoodShop(new InfoService(),new SupplyOrderService(),new SupplierRepository()),new Product(Category.DRINKS,145552,15, Unit.LITER, LocalDate.of(2019, 2, 15),"Germany",23));
    }

    @Override
    public void process(Offer offer, ShopDependency shopDependency){

        String originOfProduct = offer.getProduct().getMadeIn();
        String avoidedOrigin = shopDependency.getMadeIn();
        double budget = shopDependency.getBudget();
        int quantity = shopDependency.getRequestedQuantity();
        double unitPrice = offer.getProduct().getProductPrice();
        double goodsCost = quantity * unitPrice;
        String currentSupplierName = offer.getSupplier().getSupplierName();


        if (!originOfProduct.equals(avoidedOrigin) && goodsCost<=budget){
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
        return "ExtraFoodShop";
    }

    @Override
    public int getSupplierId(){
        return 100200300;
    }
}
