package com.mycompany.patterns.factory;

import com.mycompany.patterns.factory.models.DiscountType;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class FactoryData {
    private final DiscountType discountType;

    private final String name;
    private final int basePrice;
    private final int finalPrice;
    private final List<String> productIds;
}
