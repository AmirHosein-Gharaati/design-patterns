package com.mycompany.patterns.factory;

import com.mycompany.patterns.factory.dto.RequestDto;
import com.mycompany.patterns.factory.models.DiscountType;
import lombok.Getter;

import java.util.List;

@Getter
public class FactoryData {
    private final DiscountType discountType;

    private final String name;
    private final int basePrice;
    private final int finalPrice;
    private final List<String> productIds;

    public FactoryData(RequestDto requestDto) {
        this.discountType = requestDto.getDiscountType();
        this.name = requestDto.getName();
        this.basePrice = requestDto.getBasePrice();
        this.finalPrice = requestDto.getFinalPrice();
        this.productIds = requestDto.getProductIds();
    }
}
