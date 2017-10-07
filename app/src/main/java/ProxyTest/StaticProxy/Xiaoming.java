package ProxyTest.StaticProxy;
/*
 * Created by jingbiaozhen on 2017/10/7.
 **/

public class Xiaoming implements ILawsuit {
    @Override
    public String submit() {
        return "老板拖欠工资，准备提交证据提起诉讼";
    }

    @Override
    public String burden() {
        return "一年的工资流水和合同";
    }

    @Override
    public String defend() {
        return "证据确凿，没什么好说的";
    }

    @Override
    public String finish() {
        return "诉讼成功，判决七个工作日内还";
    }
}
