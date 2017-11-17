package com.ach;

import com.ach.Lily;

public class Main {



    public static void main(String[] args) {
  TouTiaoData touTiaoData=new TouTiaoData();
  Lily lily=new Lily(touTiaoData);
  touTiaoData.setMsg("2017-10-30","2020要脱贫了");
        touTiaoData.setMsg("2017-10-31","2020不脱贫的，要被灭口啦");


    }

}
