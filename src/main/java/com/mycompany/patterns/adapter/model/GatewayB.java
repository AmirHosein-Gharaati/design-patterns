package com.mycompany.patterns.adapter.model;

public class GatewayB {
    public void charge(double amount) {
        System.out.println("Charging payment with GatewayB: $" + amount);
    }
}
