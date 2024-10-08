package com.guanhf.a04Template;

public abstract class HummerModel {

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    final public void run(){
        this.start();
        if(this.isAlarm())
            this.alarm();
        this.engineBoom();
        this.stop();
    }
    // 钩子方法, 默认为true
    protected boolean isAlarm(){
        return true;
    }
}
