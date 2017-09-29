package FactoryTest;
/*
 * Created by jingbiaozhen on 2017/9/29.
 * 抽象工厂方法
 **/

public abstract class Factory {
    //T 指的是产品对象类型
    public abstract <T extends Product> T createProduct(Class<T> tClass);
}
