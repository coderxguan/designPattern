package com.guanhf.test;

import java.util.Scanner;

public class Block {
    public static void main(String[] args) {
        ConcreteBlockFactory concreteBlockFactory = new ConcreteBlockFactory();
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < count; i++) {
            String[] s = scanner.nextLine().split(" ");
            String Type = s[0];
            int num = Integer.parseInt(s[1]);
            for (int j = 0; j < num; j++) {
                if("Circle".equals(Type)) {
                    CircleBlock block = concreteBlockFactory.createBlock(CircleBlock.class);
                    block.produce();
                } else {
                    SquareBlock block = concreteBlockFactory.createBlock(SquareBlock.class);
                    block.produce();
                }
            }
        }
    }
}

// block interface
abstract class Product {
    public abstract void produce();
}

// circle block
class CircleBlock extends Product{
    @Override
    public void produce() {
        System.out.println("Circle Block");
    }
}

// square block
class SquareBlock extends Product{
    @Override
    public void produce() {
        System.out.println("Square Block");
    }
}

// factory interface
abstract class BlockFactory{
    public abstract <T extends Product> T createBlock(Class<T> c);
}

class ConcreteBlockFactory extends BlockFactory{

    @Override
    public <T extends Product> T createBlock(Class<T> c) {
        Product product = null;
        try {
            product = (Product) Class.forName(c.getName()).getDeclaredConstructor().newInstance();
        }catch (Exception e){
            System.out.println("error");
        }

        return (T)product;
    }
}



