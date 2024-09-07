package com.guanhf.a02factory1;

public class SimpleCreator {
    public static <T extends Product> T createProduct(Class<T> c){
        Product product = null;
        try {
            product = (Product) Class.forName(c.getName()).newInstance();
        } catch (Exception e){
            System.out.println("exception");
        }
        return (T)product;
    }
}
