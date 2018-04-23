package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ccm on 2018/4/19.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }

}
