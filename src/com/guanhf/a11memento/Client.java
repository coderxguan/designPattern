package com.guanhf.a11memento;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();

        originator.setState("初始状态..");
        System.out.println("初始状态是, " + originator.getState());

        // 建立备份
        originator.createMemento();
        originator.setState("修改后的状态..");
        System.out.println("修改后的状态, " + originator.getState());

        // 恢复备份
        originator.restoreMemento();
        System.out.println("恢复后的状态, " + originator.getState());
    }
}
