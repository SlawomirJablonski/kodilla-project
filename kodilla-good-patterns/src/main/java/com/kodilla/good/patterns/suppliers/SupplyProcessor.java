package com.kodilla.good.patterns.suppliers;

public class SupplyProcessor {

    private InfoService infoService;
    private SupplyOrderService supplyOrderService;
    private SupplierRepository supplierRepository;

    public SupplyProcessor(final InfoService infoService, final SupplyOrderService supplyOrderService, final SupplierRepository supplierRepository) {
        this.infoService = infoService;
        this.supplyOrderService = supplyOrderService;
        this.supplierRepository = supplierRepository;
    }

    public void process(final Offer offer, ShopDependency shopDependency) {

        double budget = shopDependency.getBudget();
        int quantity = shopDependency.getRequestedQuantity();
        double unitPrice = offer.getProduct().getProductPrice();
        double goodsCost = quantity * unitPrice;
        String currentSupplierName = offer.getSupplier().getSupplierName();

        if (budget>goodsCost){
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
}
