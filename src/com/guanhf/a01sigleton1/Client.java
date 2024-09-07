package com.guanhf.a01sigleton1;


/*
* Singleton Pattern 单例模式
* Ensure a class has only one instance,
* and provide a global point of access to it
* */
public class Client {
    public static void main(String[] args) {
        // 创建一个单例对象
        Singleton singleton = Singleton.getInstance();
        singleton.doSomething();
        Singleton.doSomething();
    }
}
