package com.example.jingbiaozhen.notificationdemo;

import java.lang.reflect.Proxy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
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
import MVCTest.Fatigue;
import MVCTest.Health;
import MVCTest.PersonController;
import MVCTest.PersonModel;
import MVCTest.PersonView;
import MVPTest.LoginPresenterImpl;
import MVPTest.LoginView;
import ObserverTest.OneWeatherObserver;
import ObserverTest.TwoWeatherObserver;
import ObserverTest.Weather;
import ProxyTest.DynamicProxy.DynamicProxy;
import ProxyTest.StaticProxy.ILawsuit;
import ProxyTest.StaticProxy.Lawyer;
import ProxyTest.StaticProxy.Xiaoming;
import StrategyTest.BusCalculateStrategy;
import StrategyTest.TrafficSrategy;

public class MainActivity extends AppCompatActivity implements LoginView, View.OnClickListener
{

    private TextView computerTv;

    private ProgressBar progressBar;

    private EditText username;

    private EditText password;

    private LoginPresenterImpl presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        init();

    }

    private void initUI()
    {
        computerTv = (TextView) findViewById(R.id.tv_computer);
        progressBar = (ProgressBar) findViewById(R.id.progress);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        findViewById(R.id.button).setOnClickListener(this);

        presenter = new LoginPresenterImpl(this);
    }

    private void init()
    {
        // performBuilder();// 建造者模式
        // performFactory();// 工厂模式
        // performStrategy();// 策略模式
        // performObserver();// 观察者模式
        // performAdapter();// 适配器模式
        // performStaticProxy();//静态代理
        // performDynamicProxy();//动态代理
        performMVC();// MVC 模式

    }

    private void performMVC()
    {

        PersonModel personModel = new PersonModel(Health.HEALTH, Fatigue.SLEEP);
        PersonView personview = new PersonView();
        PersonController control = new PersonController(personModel, personview);
        computerTv.setText(control.updateView());
    }

    private void performDynamicProxy()
    {
        ILawsuit xiaoming = new Xiaoming();
        DynamicProxy proxy = new DynamicProxy(xiaoming);
        ClassLoader loader = xiaoming.getClass().getClassLoader();
        ILawsuit lawyer = (ILawsuit) Proxy.newProxyInstance(loader, new Class[] {ILawsuit.class}, proxy);
        computerTv.setText(lawyer.burden() + lawyer.defend() + lawyer.finish());
    }

    private void performStaticProxy()
    {
        ILawsuit xiaoming = new Xiaoming();
        Lawyer lawyer = new Lawyer(xiaoming);
        computerTv.setText(lawyer.burden() + lawyer.defend() + lawyer.finish());
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

    @Override
    public void showProgress()
    {
        progressBar.setVisibility(View.VISIBLE);

    }

    @Override
    public void hideProgress()
    {
        progressBar.setVisibility(View.GONE);

    }

    @Override
    public void setUsernameError()
    {

        username.setError(getString(R.string.username_error));
    }

    @Override
    public void setPasswordError()
    {
        username.setError(getString(R.string.password_error));

    }

    @Override
    public void navigateToHome()
    {


    }

    @Override
    public void onClick(View view)
    {

    }

    @Override
    protected void onDestroy()
    {
        presenter.destory();
        super.onDestroy();
    }
}
