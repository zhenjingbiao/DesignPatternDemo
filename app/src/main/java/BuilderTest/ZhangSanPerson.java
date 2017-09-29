package BuilderTest;
/*
 * Created by jingbiaozhen on 2017/9/29.
 **/

public class ZhangSanPerson extends Person
{
    private int age;

    private String sex;

    private int high;

    private int score;

    private String name;

    @Override
    public void setAge(int age)
    {
        this.age = age;
    }

    @Override
    public void setSex(String sex)
    {
        this.sex = sex;

    }

    @Override
    public void setHigh(int high)
    {
        this.high = high;

    }

    @Override
    public void setScore(int score)
    {
        this.score = score;

    }

    @Override
    public void setName()
    {
        name = "张三";
    }

    @Override
    public String toString() {
        return "ZhangSanPerson{" +
                "age=" + age +
                ", sex='" + sex + '\'' +
                ", high=" + high +
                ", score=" + score +
                ", name='" + name + '\'' +
                '}';
    }
}
