package ObserverTest;
/*
 * Created by jingbiaozhen on 2017/9/29.
 **/

import java.util.ArrayList;
import java.util.List;

public class Weather
{
    private WeatherType currentWeather;

    private List<WeatherObserver> observers;

    public Weather()
    {
        observers = new ArrayList<>();
        currentWeather = WeatherType.SUNNY;
    }

    public void addObserver(WeatherObserver observer)
    {
        observers.add(observer);
    }

    public void removeObserver(WeatherObserver observer)
    {
        observers.remove(observer);
    }
    public void timePass(){
        WeatherType[]weatherTypes=WeatherType.values();
        currentWeather=weatherTypes[(currentWeather.ordinal()+1)%weatherTypes.length];
        notifyOberver();
    }

    private void notifyOberver() {
        for (WeatherObserver observer : observers) {
            observer.update(currentWeather);
        }
    }
}
