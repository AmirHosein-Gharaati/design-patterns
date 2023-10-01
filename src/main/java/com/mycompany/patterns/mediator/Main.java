package com.mycompany.patterns.mediator;

import com.mycompany.patterns.mediator.modules.InventoryModule;
import com.mycompany.patterns.mediator.modules.PurchaseModule;

public class Main {
    public static void main(String[] args) {
        ModuleMediator mediator = new Mediator();

        mediator.registerModule(new PurchaseModule());
        mediator.registerModule(new InventoryModule());

        mediator.moduleAction("PURCHASE");
        mediator.moduleAction("INVENTORY");
        mediator.moduleAction("REPORT");
    }
}
