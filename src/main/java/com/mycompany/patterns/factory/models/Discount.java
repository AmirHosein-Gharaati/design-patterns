package com.mycompany.patterns.factory.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public abstract class Discount {
    protected String name;
    protected int basePrice;
    protected int finalPrice;
}
