package ObserverTest;
/*
 * Created by jingbiaozhen on 2017/9/29.
 **/

import android.util.Log;

public class TwoWeatherObserver implements WeatherObserver
{
    @Override
    public void update(WeatherType currentWeather)
    {
        switch (currentWeather)
        {
            case SUNNY:
                Log.i("two-WeatherObserver", "two-update: 大晴天");
            case RAINY:
                Log.i("two-WeatherObserver", "two-update: 下雨天");
            case WINDY:
                Log.i("two-WeatherObserver", "two-update: 起风了");
            case COLD:
                Log.i("two-WeatherObserver", "two-update: 好冷啊");
            default:
                break;
        }
    }
}
