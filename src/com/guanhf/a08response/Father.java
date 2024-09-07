package com.guanhf.a08response;

public class Father extends Handler{

    public Father(){
        super(Handler.FATHER_LEVER_RESPONSE);
    }

    @Override
    protected void Response(IWoman woman) {
        System.out.println("--daughter ask for father--");
        System.out.println(woman.getRequest());
        System.out.println("father answer: agree\n");
    }
}
