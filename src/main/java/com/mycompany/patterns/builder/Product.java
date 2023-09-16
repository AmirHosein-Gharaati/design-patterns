package com.mycompany.patterns.builder;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private String productId;
    private String name;
    private String color;
    private int price;

    private Product(Builder builder) {
        this.productId = builder.productId;
        this.name = builder.name;
        this.color = builder.color;
        this.price = builder.price;
    }

    public static Builder builder(String productId) {
        return new Builder(productId);
    }

    public static class Builder {
        private final String productId;
        private String name;
        private String color;
        private int price;

        private Builder(String productId) {
            this.productId = productId;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Builder price(int price) {
            this.price = price;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }
}
