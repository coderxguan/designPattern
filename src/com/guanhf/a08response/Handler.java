package com.guanhf.a08response;

public abstract class Handler {
    public final static int FATHER_LEVER_RESPONSE = 1;
    public final static int HUSBAND_LEVER_RESPONSE = 2;
    public final static int SON_LEVER_RESPONSE = 3;

    private int level;

    private Handler nextHandler;

    public Handler(int level) {
        this.level = level;
    }

    public final void HandleMessage(IWoman woman){
        if(woman.getType() == this.level){
            this.Response(woman);
        }else{
            if(this.nextHandler != null){
                nextHandler.HandleMessage(woman);
            }else{
                System.out.println("no place to request");
            }
        }
    }

    public void setNextHandler(Handler handler){
        this.nextHandler = handler;
    }



    protected abstract void Response (IWoman woman);


}
