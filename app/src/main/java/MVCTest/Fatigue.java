package MVCTest;
/*
 * Created by jingbiaozhen on 2017/10/7.
 **/

public enum  Fatigue
{

    ALERT("alert"),TRIED("tried"),SLEEP("sleeping");

    private String title;

    Fatigue(String title)
    {
        this.title = title;
    }

    @Override
    public String toString()
    {
        return title;
    }
}
