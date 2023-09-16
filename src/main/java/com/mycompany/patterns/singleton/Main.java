package com.mycompany.patterns.singleton;

public class Main {
    public static void main(String[] args) {
        Configuration config = Configuration.getInstance();

        System.out.println(config.getPropertyOne());
        System.out.println(config.getPropertyTwo());
        System.out.println(config.getPropertyThree());
    }
}
