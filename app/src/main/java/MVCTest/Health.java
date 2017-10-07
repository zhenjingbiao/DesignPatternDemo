package MVCTest;
/*
 * Created by jingbiaozhen on 2017/10/7.
 **/

public enum Health
{
    HEALTH("healthy"), WOUNDED("wounded"), DEAD("dead");

    private String title;
    Health(String title){
        this.title=title;
    }

    @Override
    public String toString() {
        return title;
    }
}
