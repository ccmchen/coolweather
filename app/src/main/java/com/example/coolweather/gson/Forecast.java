package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ccm on 2018/4/19.
 * 未来天气
 */

public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperaTure;

    @SerializedName("cond")
    public More more;
    //最高温，最低温
    public class Temperature{
        public String max;
        public String min;
    }

    public class More {
        @SerializedName("txt_d")
        public String info;
    }
}
