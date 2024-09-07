package com.guanhf.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class cart {
    public static void main(String[] args) throws IOException {
        shoppingCart cart = shoppingCart.getInstance();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while((line = reader.readLine())!= null){
            String[] s = line.split(" ");
            String itemName = s[0];
            int quantity = Integer.parseInt(s[1]);
            cart.addItem(itemName, quantity);
        }
        cart.showCart();
    }
}


class shoppingCart {

    private static final shoppingCart instance = new shoppingCart();
    private Map<String, Integer> cart;

    private shoppingCart(){
        cart = new LinkedHashMap<String, Integer>();
    }

    // 静态方法返回实例
    public static shoppingCart getInstance(){
        return instance;
    }

    public void addItem(String item, int quantity){
        cart.put(item, cart.getOrDefault(item, 0) + quantity);
    }

    public void showCart(){
        System.out.println("Cart Items:");
        for(Map.Entry<String, Integer> entry : cart.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
