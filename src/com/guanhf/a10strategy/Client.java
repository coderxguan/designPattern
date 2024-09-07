package com.guanhf.a10strategy;

public class Client {
    public static void main(String[] args) {
        Strategy strategy = null;
        strategy = new ConcreteStrategy1();
        Context context = new Context(strategy);
        strategy.doSomething();
        strategy = new ConcreteStrategy2();
        context = new Context(strategy);
        context.doAnyThing();
    }
}
