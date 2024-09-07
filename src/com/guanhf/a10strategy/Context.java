package com.guanhf.a10strategy;

public class Context {
    Strategy strategy = null;
    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void doAnyThing(){
        this.strategy.doSomething();
    }
}
