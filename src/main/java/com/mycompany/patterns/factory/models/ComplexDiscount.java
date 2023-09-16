package com.mycompany.patterns.factory.models;

import lombok.Getter;

import java.util.List;

@Getter
public class ComplexDiscount extends Discount {
    private final List<String> productIds;

    public ComplexDiscount(String name, int basePrice, int lastPrice, List<String> productIds) {
        super(name, basePrice, lastPrice);
        this.productIds = productIds;
    }
}
