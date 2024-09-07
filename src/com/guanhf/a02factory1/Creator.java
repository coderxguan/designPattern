package com.guanhf.a02factory1;

public abstract class Creator {
    public abstract <T extends Product> T createProduct(Class<T> c);
}
