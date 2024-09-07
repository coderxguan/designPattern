package com.guanhf.a08response;

public class Son extends Handler{

    public Son(){
        super(Handler.SON_LEVER_RESPONSE);
    }
    @Override
    protected void Response(IWoman woman) {
        System.out.println("-- mom ask for son --");
        System.out.println(woman.getRequest());
        System.out.println("son answer: agree\n");
    }
}
