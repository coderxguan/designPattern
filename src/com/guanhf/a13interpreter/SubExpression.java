package com.guanhf.a13interpreter;

import java.util.HashMap;

public class SubExpression extends SymbolExpression{
    public SubExpression(Expression left, Expression right){
        super(left, right);
    }
    @Override
    public int interpret(HashMap<String, Integer> var) {
        return super.left.interpret(var) - super.left.interpret(var);
    }
}
