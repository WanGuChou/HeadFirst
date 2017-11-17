package com.ac;

import java.util.Observable;
import java.util.Observer;

public class Lily implements Observer {

    private  TouTiaoDate touTiaoDate;

    public Lily(TouTiaoDate touTiaoDate) {
        this.touTiaoDate = touTiaoDate;
        touTiaoDate.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof TouTiaoDate){
            System.out.println(touTiaoDate.getMsg());
        }
    }
}
