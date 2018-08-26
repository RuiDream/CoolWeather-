package com.example.stardream.coolweather.gson;
import com.google.gson.annotations.SerializedName;
import java.util.List;
/**
 * Created by StarDream on 2018/8/24.
 */
public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    //由于daily_forecase中包含的是一个数组，
    //这里使用List集合来引用Forecast类
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
