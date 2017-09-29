package FactoryTest;
/*
 * Created by jingbiaozhen on 2017/9/29.
 **/

import android.content.Context;
import android.widget.Toast;

public class ProduceA extends Product {
    @Override
    public void produce(Context context) {
        Toast.makeText(context,"I'am ProduceA",Toast.LENGTH_SHORT).show();
    }
}
