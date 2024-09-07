package com.guanhf.a07prototype;

import java.util.ArrayList;

public class Thing implements Cloneable{

    private ArrayList<String> list = new ArrayList<>();

    Thing(){
        System.out.println("Thing constructor");
    }

    @Override
    public Thing clone(){
        Thing thing = null;
        try {
            thing = (Thing) super.clone();
            thing.list = (ArrayList<String>) this.list.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing;
    }

    public void setValue(String value){
        this.list.add(value);
    }

    public ArrayList<String> getList(){
        return this.list;
    }
}
