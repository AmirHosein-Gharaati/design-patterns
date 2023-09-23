package com.mycompany.patterns.adapter;

import com.mycompany.patterns.adapter.model.GatewayA;
import com.mycompany.patterns.adapter.model.GatewayB;
import com.mycompany.patterns.adapter.model.PaymentGateway;

public class Main {
    public static void main(String[] args) {
        PaymentGateway gateway1 = new GatewayA();
        PaymentGateway gateway2 = new GatewayBAdapter(new GatewayB());

        double amount = 100.0;

        gateway1.processPayment(amount);
        gateway2.processPayment(amount);
    }
}
