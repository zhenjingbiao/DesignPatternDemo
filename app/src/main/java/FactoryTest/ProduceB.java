package FactoryTest;
/*
 * Created by jingbiaozhen on 2017/9/29.
 **/

import android.content.Context;
import android.widget.Toast;

public class ProduceB extends Product {
    @Override
    public void produce(Context context) {
        Toast.makeText(context,"I'am ProduceB",Toast.LENGTH_SHORT).show();
    }
}
