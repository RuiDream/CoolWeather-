package com.example.stardream.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by StarDream on 2018/8/24.
 */

public class Forecast {
    @SerializedName("date")
    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature{
        @SerializedName("max")
        public String max;

        @SerializedName("min")
        public String min;
    }
    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
