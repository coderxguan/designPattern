package com.guanhf.a03abstractfactory1;

public abstract class AbstractYellowHuman implements Human{
    public void getColor(){
        System.out.println("黄色人种皮肤是黄色的!");
    }
    public void talk() {
        System.out.println("黄色人种会说话, 一般说的都是双字节.");
    }
}
