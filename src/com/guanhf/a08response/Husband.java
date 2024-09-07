package com.guanhf.a08response;

public class Husband extends Handler{

    public Husband(){
        super(Handler.HUSBAND_LEVER_RESPONSE);
    }

    @Override
    protected void Response(IWoman woman) {
        System.out.println("-- wife ask for husband --");
        System.out.println(woman.getRequest());
        System.out.println("husband answer: agree\n");
    }
}
