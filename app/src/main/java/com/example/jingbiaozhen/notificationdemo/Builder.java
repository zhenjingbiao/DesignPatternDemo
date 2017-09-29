package com.example.jingbiaozhen.notificationdemo;
/*
 * Created by jingbiaozhen on 2017/9/28.
 **/

public abstract class Builder {
    public abstract Builder buildBroad(String broad);
    public abstract Builder buildDisplay(String display);
    public abstract Builder buildOs();
    public abstract Computer build();
}
