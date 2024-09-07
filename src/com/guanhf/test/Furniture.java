package com.guanhf.test;

import java.util.Scanner;

public class Furniture {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();  // 消耗掉上面产生的换行符

        for (int i = 0; i < n; i++) {
            String type = scanner.nextLine();
            FurnitureFactory furnitureFactory = null;
            if(type.equals("modern")){
                furnitureFactory = new ModernFurnitureFactory();
            }else if (type.equals("classical")){
                furnitureFactory = new ClassicalFurnitureFactory();
            }

            Chair chair = furnitureFactory.createChair();
            Sofa sofa = furnitureFactory.createSofa();

            chair.showInfo();
            sofa.showInfo();
        }
    }
}


interface Chair{
    void showInfo();
}

interface Sofa{
    void showInfo();
}

interface FurnitureFactory{
    Chair createChair();
    Sofa createSofa();
}

class ModernChair implements Chair{

    @Override
    public void showInfo() {
        System.out.println("modern chair");
    }
}

class ClassicalChair implements Chair{

    @Override
    public void showInfo() {
        System.out.println("classical chair");
    }
}

class ModernSofa implements Sofa{

    @Override
    public void showInfo() {
        System.out.println("modern sofa");
    }
}

class ClassicalSofa implements Sofa {

    @Override
    public void showInfo() {
        System.out.println("classical sofa");
    }
}

class ModernFurnitureFactory implements FurnitureFactory{

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}

class ClassicalFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new ClassicalChair();
    }

    @Override
    public Sofa createSofa() {
        return new ClassicalSofa();
    }
}
