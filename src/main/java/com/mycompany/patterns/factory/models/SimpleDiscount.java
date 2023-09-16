package com.mycompany.patterns.factory.models;

import lombok.Getter;

@Getter
public class SimpleDiscount extends Discount {
    private final String productId;

    public SimpleDiscount(String name, int basePrice, int lastPrice, String productId) {
        super(name, basePrice, lastPrice);
        this.productId = productId;
    }
}
