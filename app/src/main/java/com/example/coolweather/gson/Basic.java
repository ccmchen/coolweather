package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ccm on 2018/4/19.
 * JSON中使用@SerializedName注解的方式来让json字段和Java字段建立映射关系
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }

}
