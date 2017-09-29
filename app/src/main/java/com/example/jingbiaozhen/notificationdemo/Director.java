package com.example.jingbiaozhen.notificationdemo;
/*
 * Created by jingbiaozhen on 2017/9/28.
 **/

public class Director {
    public Builder mBuilder=null;
    public Director(Builder builder){
        mBuilder=builder;
    }
    public void contruct(String broad,String display){
        mBuilder.buildBroad(broad);
        mBuilder.buildDisplay(display);
        mBuilder.buildOs();
    }
}
