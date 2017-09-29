package FactoryTest;
/*
 * Created by jingbiaozhen on 2017/9/29.
 * 具体工厂类，通过反射获取
 **/

public class ConcreteFactory extends Factory {
    @Override
    public <T extends Product> T createProduct(Class<T> tClass) {
        Product product=null;
        try {
            product= (Product) Class.forName(tClass.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}
