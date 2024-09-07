package com.guanhf.a04Template;

public class HummerH1 extends HummerModel{
    private boolean alarmFlag = true;


    @Override
    protected void start() {
        System.out.println("h1 start");
    }

    @Override
    protected void stop() {
        System.out.println("h1 stop");
    }

    @Override
    protected void alarm() {
        System.out.println("h1 alarm");
    }

    @Override
    protected void engineBoom() {
        System.out.println("h1 engine boom");
    }

    public void setAlarm(boolean alarmFlag) {
         this.alarmFlag = alarmFlag;
    }
}
