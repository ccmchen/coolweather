package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by ccm on 2018/4/12.
 * 县数据库表结构
 */

public class County extends DataSupport {

    private int id;
    //县级名字
    private String countyName;
    //县级所对应的天气
    private String weatherId;
    //当前县所属的市id
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
