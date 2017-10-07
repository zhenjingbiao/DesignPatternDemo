package MVCTest;
/*
 * Created by jingbiaozhen on 2017/10/7.
 **/

public class PersonController
{
    private PersonModel mPersonModel;

    private PersonView mPersonView;

    public PersonController(PersonModel model, PersonView personView)
    {
        mPersonModel = model;
        mPersonView = personView;
    }

    public Health getHealth()
    {
        return mPersonModel.getHealth();
    }

    public Fatigue getFatigue()
    {
        return mPersonModel.getFatigue();
    }

    public void setFatigue(Fatigue fatigue)
    {
        mPersonModel.setFatigue(fatigue);
    }

    public void setHealth(Health health)
    {
        mPersonModel.setHealth(health);
    }

    public String updateView()
    {
        return mPersonView.displayPerson(mPersonModel);
    }
}
