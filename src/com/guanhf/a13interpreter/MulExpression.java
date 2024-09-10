package com.guanhf.a13interpreter;

import java.util.HashMap;

public class MulExpression extends SymbolExpression{
    public MulExpression(Expression left, Expression right){
        super(left, right);
    }
    @Override
    public int interpret(HashMap<String, Integer> var) {
        return left.interpret(var) * right.interpret(var);
    }
}
