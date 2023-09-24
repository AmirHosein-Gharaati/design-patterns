package com.mycompany.patterns.proxy;

import com.mycompany.patterns.proxy.service.CrucialProxy;

public class Main {
    public static void main(String[] args) {
        CrucialProxy crucialProxy = new CrucialProxy();
        crucialProxy.operate("Proxy Pattern");
    }
}
