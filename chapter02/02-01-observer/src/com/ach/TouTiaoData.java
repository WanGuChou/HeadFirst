package com.ach;

import java.util.ArrayList;

public class TouTiaoData implements Subject{
    private String timeMsg;
    private  String contextMsg;
    private ArrayList<Observer> observers;

    public TouTiaoData() {
        this.observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(timeMsg,contextMsg));
    }

    public void setMsg(String timeMsg,String contextMsg){
        this.timeMsg=timeMsg;
        this.contextMsg=contextMsg;
        notifyObservers();
    }
}
