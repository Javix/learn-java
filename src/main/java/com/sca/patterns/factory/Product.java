package com.sca.patterns.factory;

public abstract class Product {
    public void writeName(String name) {
        System.out.println("My name is " + name);
    }
}
