package com.guanhf.a13interpreter;

import java.util.HashMap;

public abstract class Expression {
    public abstract int interpret(HashMap<String, Integer> var);
}
