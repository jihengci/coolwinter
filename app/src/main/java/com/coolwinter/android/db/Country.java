package com.coolwinter.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 恒慈 on 2017/12/23.
 */

public class Country extends DataSupport{
    private int id;
    private String countryname;
    private String weatherId;
    private int cityId;
    public  int getId(){
        return  id;
    }
    public  void setId(int id){
        this.id=id;
    }
    public String getCountryname(){
        return  countryname;
    }
    public void setCountryname(String countryname){
        this.countryname=countryname;
    }
    public  String getWeatherId(){
        return weatherId;
    }
    public void  setWeatherId(String weatherId){
        this.weatherId=weatherId;
    }
    public  int getCityId(){
        return  cityId;
    }
    public  void  setCityId(int cityId){
        this.cityId=cityId;
    }
}
