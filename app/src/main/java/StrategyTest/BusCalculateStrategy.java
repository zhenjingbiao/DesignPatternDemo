package StrategyTest;
/*
 * Created by jingbiaozhen on 2017/9/29.
 **/

public class BusCalculateStrategy implements CalculateStrategy {
    @Override
    public String  caculatePrice() {
        return "这是Bus的计算方式";
    }
}
