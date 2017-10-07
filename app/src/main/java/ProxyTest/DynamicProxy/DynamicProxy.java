package ProxyTest.DynamicProxy;
/*
 * Created by jingbiaozhen on 2017/10/7.
 **/

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler{
    private Object mObject;
    public DynamicProxy(Object obj){
        mObject=obj;
    }
    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        //调用被代理类的方法
        Object result=method.invoke(mObject,objects);
        return result;
    }
}
