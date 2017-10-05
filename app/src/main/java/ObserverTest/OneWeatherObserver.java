package ObserverTest;
/*
 * Created by jingbiaozhen on 2017/9/29.
 **/

import android.util.Log;

public class OneWeatherObserver implements WeatherObserver
{
    @Override
    public void update(WeatherType currentWeather)
    {
        switch (currentWeather)
        {
            case SUNNY:
                Log.i("one-WeatherObserver", "one-update: 大晴天");
            case RAINY:
                Log.i("one-WeatherObserver", "one-update: 下雨天");
            case WINDY:
                Log.i("one-WeatherObserver", "one-update: 起风了");
            case COLD:
                Log.i("one-WeatherObserver", "one-update: 好冷啊");
            default:
                break;
        }
    }
}
