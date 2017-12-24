package com.coolwinter.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 恒慈 on 2017/12/23.
 */

public class city extends DataSupport {
    private int id;
    private String cityName;
    private  int citycode;
    private int provinceId;
    public  int getId(){
        return  id;
    }
    public  void  setId(int id){
        this.id=id;
    }
    public String getCityNmae(){
        return  cityName;
    }
    public void  setCityName(String cityName){
        this.cityName=cityName;
    }
    public int getCitycode(){
        return  citycode;
    }
    public void setCitycode(int citycode){
        this.citycode=citycode;
    }
    public int getProvinceId(int provinceId){
        return this.provinceId;
    }
    public  void setProvinceId(int provinceId){
        this.provinceId=provinceId;
    }
}
