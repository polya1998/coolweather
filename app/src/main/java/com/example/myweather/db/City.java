package com.example.myweather.db;

import org.litepal.crud.DataSupport;

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getcityName(){
        return cityName;
    }
    public void setProvinceName(String cityname){
        this.cityName=cityname;
    }
    public int getcityCode(){
        return cityCode;
    }
    public void setProvinceCode(int citycode){
        this.cityCode=citycode;
    }
    public int getProvinceId(){
        return provinceId;
    }
    public void setProvinceId(int provinceid){
        this.provinceId=provinceid;
    }

}
