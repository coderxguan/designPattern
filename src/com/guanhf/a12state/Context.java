package com.guanhf.a12state;

public class Context {
    public final static State STATE1 = new ConcreteState1();
    public final static State STATE2 = new ConcreteState2();

    private State CurrentState;

    public State getCurrentState(){
        return CurrentState;
    }

    public void setCurrentState(State state){
        this.CurrentState = state;
        this.CurrentState.setContext(this);
    }

    public void handle1(){
        this.CurrentState.handle1();
    }
    public void handle2(){
        this.CurrentState.handle2();
    }
}
