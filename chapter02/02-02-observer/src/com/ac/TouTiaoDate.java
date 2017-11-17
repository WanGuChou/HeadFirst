package com.ac;

import java.util.Observable;

public class TouTiaoDate extends Observable {
private  String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void sendMsg(String msg){
    this.msg=msg;
    setChanged();
    notifyObservers();
}

}
