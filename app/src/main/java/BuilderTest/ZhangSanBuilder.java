package BuilderTest;
/*
 * Created by jingbiaozhen on 2017/9/29.
 **/

public class ZhangSanBuilder extends PersonBuild
{
    private ZhangSanPerson mZhangSanPerson = new ZhangSanPerson();

    @Override
    public PersonBuild setAge(int age)
    {
        mZhangSanPerson.setAge(age);
        return this;
    }

    @Override
    public PersonBuild setSex(String sex)
    {
        mZhangSanPerson.setSex(sex);
        return this;
    }

    @Override
    public PersonBuild setHigh(int high)
    {
        mZhangSanPerson.setHigh(high);
        return this;
    }

    @Override
    public PersonBuild setScore(int score)
    {
        mZhangSanPerson.setScore(score);
        return this;
    }

    @Override
    public PersonBuild setName() {
        mZhangSanPerson.setName();
        return this;
    }


    @Override
    public Person build()
    {
        return mZhangSanPerson;
    }

}
