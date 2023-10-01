package com.mycompany.patterns.mediator;

import com.mycompany.patterns.mediator.modules.MyModule;

public interface ModuleMediator {
    void registerModule(MyModule module);
    boolean isModuleAvailable(String moduleName);
    void moduleAction(String moduleName);
}
