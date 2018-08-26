package com.example.stardream.coolweather.gson;
import com.google.gson.annotations.SerializedName;
/**
 * Created by StarDream on 2018/8/24.
 */
public class AQI {
    public AQICity city;
    public class AQICity{
        @SerializedName("aqi")
        public String aqi;

        @SerializedName("pm25")
        public String pm25;
    }
}
