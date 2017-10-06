package com.example.jingbiaozhen.notificationdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import AdapterTest.Captain;
import AdapterTest.FinshingAdapter;
import BuilderTest.Person;
import BuilderTest.ZhangSanBuilder;
import FactoryTest.ConcreteFactory;
import FactoryTest.Factory;
import FactoryTest.ProduceA;
import FactoryTest.ProduceB;
import FactoryTest.ProduceC;
import ObserverTest.OneWeatherObserver;
import ObserverTest.TwoWeatherObserver;
import ObserverTest.Weather;
import StrategyTest.BusCalculateStrategy;
import StrategyTest.TrafficSrategy;

public class MainActivity extends AppCompatActivity
{

    private TextView computerTv;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        computerTv = (TextView) findViewById(R.id.tv_computer);
        init();

    }

    private void init()
    {
       // performBuilder();// 建造者模式
       // performFactory();// 工厂模式
       // performStrategy();// 策略模式
       // performObserver();// 观察者模式
        performAdapter();// 适配器模式

    }

    private void performAdapter()
    {
        // 适配器模式
        Captain captain = new Captain(new FinshingAdapter());
        computerTv.setText(captain.row());
    }

    private void performStrategy()
    {
        // 策略模式
        TrafficSrategy srategy = new TrafficSrategy();
        srategy.setCalculateStrategy(new BusCalculateStrategy());
        computerTv.setText(srategy.calculatePrice());

    }

    private void performObserver()
    {
        // 监听者模式
        Weather weather = new Weather();
        weather.addObserver(new OneWeatherObserver());
        weather.addObserver(new TwoWeatherObserver());
        weather.timePass();
        weather.timePass();
        weather.timePass();
        weather.timePass();
    }

    private void performFactory()
    {
        // 工厂模式
        Factory factory = new ConcreteFactory();
        ProduceA produceA = factory.createProduct(ProduceA.class);
        produceA.produce(this);
        ProduceB produceB = factory.createProduct(ProduceB.class);
        produceB.produce(this);
        ProduceC produceC = factory.createProduct(ProduceC.class);
        produceC.produce(this);
    }

    private void performBuilder()
    {
        // Builder模式
        Computer computer = new MacBookBuild().buildBroad("某某主板").buildDisplay("某某显示器").build();
        Person person = new ZhangSanBuilder().setName().setAge(12).setHigh(123).setSex("男").setScore(98).build();
        computerTv.setText(person.toString());
    }

}
