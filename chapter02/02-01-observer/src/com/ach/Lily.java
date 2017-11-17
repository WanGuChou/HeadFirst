package com.ach;

public class Lily implements Observer,DisplayElement {

    private Subject toutiao;
    private String  timeMsg;
    private String contextMsg;

    public Lily(Subject toutiao) {
        this.toutiao = toutiao;
        toutiao.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("lily getMsg:"+contextMsg+"("+timeMsg+")");
    }

    @Override
    public void update(String timeMsg, String contextMsg) {
this.contextMsg=contextMsg;
this.timeMsg=timeMsg;
display();
    }
}
