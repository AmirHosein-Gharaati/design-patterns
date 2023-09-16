package com.mycompany.patterns.factory.dto;

import com.mycompany.patterns.factory.models.DiscountType;
import lombok.Getter;

import java.util.List;

@Getter
public class RequestDto {
    private DiscountType discountType;
    private String name;
    private int basePrice;
    private int finalPrice;
    private List<String> productIds;
}
