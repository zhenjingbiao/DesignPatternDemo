package com.example.jingbiaozhen.notificationdemo;
/*
 * Created by jingbiaozhen on 2017/9/28.
 **/

public abstract class Computer
{
    private String mBoard;

    private String mDispaly;

    protected String mOs;

    public Computer()
    {

    }

    public void setBoard(String board)
    {
        mBoard = board;
    }

    public void setDispaly(String dispaly)
    {
        mDispaly = dispaly;
    }

    public abstract void setOs();

    @Override
    public String toString()
    {
        return "Computer is[" + "mBoard" + mBoard + ",mDisplay" + mDispaly + "]";
    }
}
