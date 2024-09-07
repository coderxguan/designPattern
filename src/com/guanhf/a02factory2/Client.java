package com.guanhf.a02factory2;

import java.sql.SQLOutput;

// 单例工厂模式
public class Client {
    public static void main(String[] args) {
//        SingletonFactory factory = new SingletonFactory();
        Singleton singleton = SingletonFactory.getSingleton();
        singleton.doSomething();
    }

}
