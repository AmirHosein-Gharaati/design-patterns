package com.mycompany.patterns.factory;

import com.mycompany.patterns.factory.models.ComplexDiscount;
import com.mycompany.patterns.factory.models.Discount;
import com.mycompany.patterns.factory.models.DiscountType;
import com.mycompany.patterns.factory.models.SimpleDiscount;
import lombok.NoArgsConstructor;


@NoArgsConstructor
public class DiscountFactory {

    public Discount create(FactoryData data) {
        if(data.getDiscountType().equals(DiscountType.SIMPLE)) {
            return createSimpleDiscount(data);
        } else if(data.getDiscountType().equals(DiscountType.COMPLEX)) {
            return createComplexDiscount(data);
        }

        throw new IllegalStateException("Bad discount type: %s".formatted(data.getDiscountType().toString()));
    }

    private Discount createSimpleDiscount(FactoryData data) {
        return new SimpleDiscount(
                data.getName(),
                data.getBasePrice(),
                data.getFinalPrice(),
                data.getProductIds().get(0)
        );
    }

    private Discount createComplexDiscount(FactoryData data) {
        return new ComplexDiscount(
                data.getName(),
                data.getBasePrice(),
                data.getFinalPrice(),
                data.getProductIds()
        );
    }
}
