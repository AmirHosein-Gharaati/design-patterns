package com.mycompany.patterns.adapter.model;

public class GatewayA implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment with gateway A: $" + amount);
    }
}
