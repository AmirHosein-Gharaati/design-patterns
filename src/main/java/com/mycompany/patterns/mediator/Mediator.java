package com.mycompany.patterns.mediator;

import com.mycompany.patterns.mediator.modules.MyModule;

import java.util.ArrayList;
import java.util.List;

public class Mediator implements ModuleMediator {
    private List<MyModule> modules;

    public Mediator() {
        this.modules = new ArrayList<>();
    }

    @Override
    public void registerModule(MyModule module) {
        this.modules.add(module);
    }

    @Override
    public boolean isModuleAvailable(String moduleName) {
        return modules.stream()
                .anyMatch(module -> module.getName().equals(moduleName));
    }

    @Override
    public void moduleAction(String moduleName) {
        if (isModuleAvailable(moduleName)) {
            System.out.println("Performing action for module: " + moduleName);
        } else {
            System.out.println("Module not available: " + moduleName);
            // Take appropriate action when the module is not available
        }
    }
}
