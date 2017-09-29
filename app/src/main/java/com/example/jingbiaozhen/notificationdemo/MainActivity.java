package com.example.jingbiaozhen.notificationdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import BuilderTest.Person;
import BuilderTest.ZhangSanBuilder;
import FactoryTest.ConcreteFactory;
import FactoryTest.Factory;
import FactoryTest.ProduceA;
import FactoryTest.ProduceB;
import FactoryTest.ProduceC;
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
        //Builder模式
        Computer computer = new MacBookBuild().buildBroad("某某主板").buildDisplay("某某显示器").build();
        Person person = new ZhangSanBuilder().setName().setAge(12).setHigh(123).setSex("男").setScore(98).build();
        //工厂模式
        Factory factory=new ConcreteFactory();
        ProduceA produceA= factory.createProduct(ProduceA.class);
        produceA.produce(this);
        ProduceB produceB= factory.createProduct(ProduceB.class);
        produceB.produce(this);
        ProduceC produceC= factory.createProduct(ProduceC.class);
        produceC.produce(this);
        //策略模式
        TrafficSrategy srategy=new TrafficSrategy();
        srategy.setCalculateStrategy(new BusCalculateStrategy());
        computerTv.setText(srategy.calculatePrice());

    }

}
