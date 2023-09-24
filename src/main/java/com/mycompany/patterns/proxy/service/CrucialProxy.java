package com.mycompany.patterns.proxy.service;

import lombok.RequiredArgsConstructor;

import java.util.logging.Logger;

@RequiredArgsConstructor
public class CrucialProxy {
    private final CrucialService service;
    private final Logger log;

    public CrucialProxy() {
        this.service = new CrucialService();
        this.log = Logger.getLogger(CrucialProxy.class.getName());
    }

    public void operate(String name) {
        log.info("Some operation has been started with name: %s".formatted(name));
        service.operate();
    }
}
