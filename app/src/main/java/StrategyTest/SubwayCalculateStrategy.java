package StrategyTest;
/*
 * Created by jingbiaozhen on 2017/9/29.
 **/

public class SubwayCalculateStrategy implements CalculateStrategy {
    @Override
    public String  caculatePrice() {
        return "这是地铁的计算方式";
    }
}
