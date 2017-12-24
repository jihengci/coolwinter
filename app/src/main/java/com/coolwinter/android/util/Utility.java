package com.coolwinter.android.util;

import android.text.TextUtils;

import com.coolwinter.android.db.Country;
import com.coolwinter.android.db.Province;
import com.coolwinter.android.db.city;
import com.coolwinter.android.gson.Weater;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by 恒慈 on 2017/12/23.
 */

public class Utility {
    public static boolean handleProvinceResponse(String response){
        if(!TextUtils.isEmpty(response)){
            try{
                JSONArray allProvinces=new JSONArray(response);
                for(int i=0;i<allProvinces.length();i++){
                    JSONObject provinceObject=allProvinces.getJSONObject(i);
                    Province province=new Province();
                    province.setProvinceName(provinceObject.getString("name"));
                    province.setProvinceCode(provinceObject.getInt("id"));
                    province.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return true;
    }
public  static boolean handCityResponse(String response,int provinceId){
    if(!TextUtils.isEmpty(response)){
        try{
            JSONArray allcitise=new JSONArray(response);
            for(int i=0;i<allcitise.length();i++){
                JSONObject cityobject=allcitise.getJSONObject(i);
                city city=new city();
                city.setCityName(cityobject.getString("name"));
                city.setCitycode(cityobject.getInt("id"));
                city.getProvinceId(provinceId);
                city.save();
            }
            return true;
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
    return true;
}
    public  static  boolean handCountryResponse(String response,int cityId){
        if(!TextUtils.isEmpty(response)){
            try{
                JSONArray allcountry=new JSONArray(response);
                for(int i=0;i<allcountry.length();i++){
                    JSONObject countryobject=allcountry.getJSONObject(i);
                    Country country=new Country();
                    country.setCountryname(countryobject.getString("name"));
                    country.setWeatherId(countryobject.getString("weather_id"));
                    country.setCityId(cityId);
                    country.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return  false;
    }
    public static Weater handleWeatherResponse(String  response){
        try{
            JSONObject jsonObject=new JSONObject(response);
            JSONArray jsonArray=jsonObject.getJSONArray("HeWeather");
            String weatherContent=jsonArray.getJSONObject(0).toString();
            return new Gson().fromJson(weatherContent,Weater.class);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


}
