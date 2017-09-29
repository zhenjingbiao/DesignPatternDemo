package com.example.jingbiaozhen.notificationdemo;

/*
 * Created by jingbiaozhen on 2017/9/28.
 **/

public class MacBookBuild extends Builder {
    private Computer  mComputer=new MacComputer();

    @Override
    public MacBookBuild buildBroad(String broad) {
        mComputer.setBoard(broad);
        return this;

    }

    @Override
    public MacBookBuild buildDisplay(String display) {
        mComputer.setDispaly(display);
        return this;

    }

    @Override
    public MacBookBuild buildOs() {
        mComputer.setOs();
        return this;

    }

    @Override
    public Computer build() {
        return mComputer;
    }
}
