package com.mycompany.patterns.factory;

import com.mycompany.patterns.factory.models.Discount;
import com.mycompany.patterns.factory.models.DiscountType;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        FactoryData factoryData = new FactoryData(
                DiscountType.SIMPLE,
                "simple discount",
                100,
                95,
                List.of("568")
        );

        DiscountFactory factory = new DiscountFactory();

        Discount discount = factory.create(factoryData);
        System.out.println(discount.getName());
    }
}
