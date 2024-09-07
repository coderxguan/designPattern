package com.guanhf.a03abstractfactory1;

/*
* Abstract Factory Pattern
* Provide an interface for creating families of relate
* or dependent objects without specifying their concrete classed
* */


public class Client {
    public static void main(String[] args) {
        HumanFactory maleHumanFactory = new MaleFactory();
        HumanFactory femaleHumanFactory = new FemaleFactory();

        Human maleYellowHuman = maleHumanFactory.createYellowHuman();

        maleYellowHuman.getColor();
        maleYellowHuman.talk();
        maleYellowHuman.getSex();
    }
}
