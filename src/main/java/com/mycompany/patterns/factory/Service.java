package com.mycompany.patterns.factory;

import com.mycompany.patterns.factory.dto.RequestDto;
import com.mycompany.patterns.factory.models.Discount;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Service {
    private final DiscountFactory factory;

    public Discount createDiscount(RequestDto requestDto) {
        FactoryData factoryData = new FactoryData(requestDto);
        Discount discount = factory.create(factoryData);

        // Maybe do some stuff with "discount"...

        return discount;
    }
}
