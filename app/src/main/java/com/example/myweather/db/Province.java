package com.example.myweather.db;

import org.litepal.crud.DataSupport;

public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int provinceCode;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getProvinceName(){
        return provinceName;
    }
    public void setProvinceName(String provincename){
        this.provinceName=provincename;
    }
    public int getProvinceCode(){
        return provinceCode;
    }
    public void setProvinceCode(int provincecode){
        this.provinceCode=provincecode;
    }
}
