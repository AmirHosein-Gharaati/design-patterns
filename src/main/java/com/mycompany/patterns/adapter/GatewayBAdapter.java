package com.mycompany.patterns.adapter;

import com.mycompany.patterns.adapter.model.GatewayB;
import com.mycompany.patterns.adapter.model.PaymentGateway;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GatewayBAdapter implements PaymentGateway {
    private GatewayB gatewayB;

    @Override
    public void processPayment(double amount) {
        gatewayB.charge(amount);
    }
}
