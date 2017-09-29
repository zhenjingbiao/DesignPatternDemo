package BuilderTest;
/*
 * Created by jingbiaozhen on 2017/9/29.
 **/

public abstract class PersonBuild {
    public abstract PersonBuild setAge(int age);
    public abstract PersonBuild setSex(String sex);
    public abstract PersonBuild setHigh(int high);
    public abstract PersonBuild setScore(int score);
    public abstract PersonBuild setName();
    public abstract Person build();
}
