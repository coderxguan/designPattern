package com.guanhf.a02factory1;

import java.util.HashMap;
import java.util.Map;

// 延迟加载

public class LazyInitial {
    private static final Map<String, Product> prMap = new HashMap<>();
    public static synchronized Product createProduct(String type) throws Exception{
        Product product = null;
        // if there is an instance in Map
        if(prMap.containsKey(type)) {
            product = prMap.get(type);
        }else {
            if(type.equals("Product1")) {
                product = new ConcreteProduct1();
            }else{
                product = new ConcreteProduct2();
            }
            prMap.put(type, product);
        }
        return product;
    }
}
