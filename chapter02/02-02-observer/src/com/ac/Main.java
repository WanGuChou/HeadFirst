package com.ac;

import java.util.Observer;

public class Main {

    public static void main(String[] args) {
        TouTiaoDate touTiaoDate=new TouTiaoDate();
        Observer o=new Lily(touTiaoDate);
        touTiaoDate.sendMsg("哈哈");
    }
}
