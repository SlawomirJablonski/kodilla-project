package com.kodilla.good.patterns.suppliers.service;

import com.kodilla.good.patterns.suppliers.model.Order;
import com.kodilla.good.patterns.suppliers.model.ShopDependency;
import com.kodilla.good.patterns.suppliers.model.SupplierDto;

import java.time.LocalDateTime;
import java.util.ArrayList;

public final class SupplierRepository {

    public SupplierDto createSupplierDto(final Order order) {
        return new SupplierDto(order.getSupplierId(), order.getCategory(), LocalDateTime.now());
    }

    public void addSupplierDto(final ShopDependency shopDependency, final SupplierDto supplierDto) {

        ArrayList<SupplierDto> currentSuppliers = shopDependency.getSupplierList();

        if (currentSuppliers.size()==0){
            currentSuppliers.add(supplierDto);
        }else{
            boolean isSupplierDto = shopDependency.getSupplierList().stream()
                    .anyMatch(s -> s.getSupplierId() == supplierDto.getSupplierId() &&
                            s.getCategory() == supplierDto.getCategory());
            if(!isSupplierDto){
                currentSuppliers.add(supplierDto);
            }
            shopDependency.setSupplierList(currentSuppliers);
        }
    }
}
