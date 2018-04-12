package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by ccm on 2018/4/12.
 * 市数据库表结构
 */

public class city extends DataSupport {

    private int id;
    //市名字
    private String cityName;
    //市代号
    private int cityCode;
    //当前市所属的省ID
    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
