package com.mycompany.patterns.builder;

public class Main {
    public static void main(String[] args) {
        Product product = Product.builder("12345")
                .name("Product Name")
                .color("Product Color")
                .price(100)
                .build();

        System.out.println("Product ID is: %s".formatted(product.getProductId()));
    }
}
