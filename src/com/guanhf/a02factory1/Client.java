package com.guanhf.a02factory1;
/*
* Factory Pattern
* Define an interface for creating an object ,
* but let subclass decide which class to instantiate
* Factory Method lets a class defer instantiation to subclasses
* */

public class Client {
    public static void main(String[] args) {
        ConcreteCreator creator = new ConcreteCreator();
        Product product1 = creator.createProduct(ConcreteProduct1.class);
        product1.method1();
        product1.method2();
        Product product2 = SimpleCreator.createProduct(ConcreteProduct2.class);
        product2.method1();
        product2.method2();
    }
}
