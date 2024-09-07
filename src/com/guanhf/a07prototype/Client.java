package com.guanhf.a07prototype;

public class Client {

    public static void main(String[] args) {
        Thing thing = new Thing();
        thing.setValue("a01");
        Thing thing2 = thing.clone();
        thing2.setValue("a02");
        System.out.println(thing.getList());
    }
}
