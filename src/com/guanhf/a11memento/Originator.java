package com.guanhf.a11memento;

public class Originator implements Cloneable{
    private String state = "";
    private Originator backup;

    public String getState(){
        return state;
    }
    public void setState(String state){
        this.state = state;
    }
    public void createMemento(){
        this.backup = this.clone();
    }
    public void restoreMemento(){
        this.setState(this.backup.getState());
    }


    protected Originator clone() {
        try {
            return (Originator) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
