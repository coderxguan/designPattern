package com.guanhf.a04Template;

public class HummerH2 extends HummerModel{
    @Override
    protected void start() {
        System.out.println("h2 start");
    }

    @Override
    protected void stop() {
        System.out.println("h2 stop");
    }

    @Override
    protected void alarm() {
        System.out.println("h2 alarm");
    }

    @Override
    protected void engineBoom() {
        System.out.println("h2 engine boom");
    }

    // 默认没有喇叭
    protected boolean isAlarm() {
        return false;
    }
}
