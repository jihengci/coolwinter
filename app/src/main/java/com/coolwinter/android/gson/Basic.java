package com.coolwinter.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 恒慈 on 2017/12/24.
 */

public class Basic {
    @SerializedName("city")
    public String cityNmae;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public  class Update{
        @SerializedName("loc")
        public String updateTime;
    }

}
