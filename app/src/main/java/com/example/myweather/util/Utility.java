package com.example.myweather.util;

import android.text.TextUtils;

import com.example.myweather.db.City;
import com.example.myweather.db.County;
import com.example.myweather.db.Province;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Utility {
    /**
     * 解析和处理服务器返回的省级数据
     */
    public  static boolean handleProvinceResponse(String response) throws JSONException {
        if(TextUtils.isEmpty(response)){
            JSONArray allProvinces=new JSONArray(response);
            for (int i =0;i<allProvinces.length();i++){
                JSONObject provinceObject = allProvinces.getJSONObject(i);
                Province province = new Province();
                province.setProvinceName(provinceObject.getString("name"));
                province.setProvinceCode(provinceObject.getInt("id"));
                province.save();
            }
            return true;
        }
        return false;
    }
    /**
     * 解析和处理返回的市级数据
     */
    public  static boolean handleCityResponse(String response ,int provinceId) throws JSONException {

        if(TextUtils.isEmpty(response)){
            JSONArray allCity=new JSONArray(response);
            for (int i =0;i<allCity.length();i++){
                JSONObject cityObject = allCity.getJSONObject(i);
                City city = new City();
                city.setcityeName(cityObject.getString("name"));
                city.setcityCode(cityObject.getInt("id"));
                city.setProvinceId(provinceId);
                city.save();
            }
            return true;
        }
        return false;
    }

    public  static boolean handleCountyResponse(String response ,int cityId) throws JSONException {

        if(TextUtils.isEmpty(response)){
            JSONArray allCounties=new JSONArray(response);
            for (int i =0;i<allCounties.length();i++){
                JSONObject countyObject = allCounties.getJSONObject(i);
                County county = new County();
                county.setCountyName(countyObject.getString("name"));
                county.setWeatherId(countyObject.getInt("id"));
                county.setCityId(cityId);
                county.save();
            }
            return true;
        }
        return false;
    }
}