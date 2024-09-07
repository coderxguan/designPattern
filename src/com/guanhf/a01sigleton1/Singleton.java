package com.guanhf.a01sigleton1;

public class Singleton {
    private static final Singleton singleton = new Singleton();
    // 私有构造方法, 限制产生多个对象
    private Singleton() {

    }
    // 通过该方法获得实例对象
    public static Singleton getInstance() {
        return singleton;
    }
    // 类中的其他方法, 尽量用static
    public static void doSomething(){
        System.out.println("doSomething");
    }
}
