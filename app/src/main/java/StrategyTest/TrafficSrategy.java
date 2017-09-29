package StrategyTest;
/*
 * Created by jingbiaozhen on 2017/9/29.
 * 交通策略
 **/

public class TrafficSrategy {
    private CalculateStrategy mCalculateStrategy;

    public void setCalculateStrategy(CalculateStrategy calculateStrategy) {
        mCalculateStrategy = calculateStrategy;
    }
    public String calculatePrice(){
        return mCalculateStrategy.caculatePrice();
    }
}
