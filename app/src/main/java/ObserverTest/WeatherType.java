package ObserverTest;
/*
 * Created by jingbiaozhen on 2017/9/29.
 * 天气的枚举
 **/

public enum WeatherType {
    SUNNY,RAINY,WINDY,COLD;

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}
