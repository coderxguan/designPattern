package com.guanhf.a09decorator;

public class ConcreteDecorator2 extends Decorator{

    public ConcreteDecorator2(Component component) {
        super(component);
    }

    private void method2(){
        System.out.println("method2 decorate");
    }
    public void operate(){
        this.method2();
        super.operate();
    }
}
