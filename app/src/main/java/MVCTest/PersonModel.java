package MVCTest;
/*
 * Created by jingbiaozhen on 2017/10/7.
 **/

public class PersonModel
{
    private Health mHealth;

    private Fatigue mFatigue;

    public PersonModel(Health health, Fatigue fatigue)
    {
        mHealth = health;
        mFatigue = fatigue;
    }

    public Health getHealth()
    {
        return mHealth;
    }

    public void setHealth(Health health)
    {
        mHealth = health;
    }

    public Fatigue getFatigue()
    {
        return mFatigue;
    }

    public void setFatigue(Fatigue fatigue)
    {
        mFatigue = fatigue;
    }

    @Override
    public String toString()
    {
        return String.format("the person looks %s,%s", mHealth, mFatigue);
    }
}
