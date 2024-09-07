package com.guanhf.a02factory2;

public class Singleton {
    // 私有构造方法, 不允许new对象
    private Singleton() {

    }
    public void doSomething(){
        System.out.println("do something");
    }
}
