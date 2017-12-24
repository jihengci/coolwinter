package com.coolwinter.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 恒慈 on 2017/12/24.
 */

public class Forecast {
    public String date;
    @SerializedName("tmp")
    public Temperture temperture;
    @SerializedName("cond")
    public More more;
    public class Temperture{
        public String max;
        public String min;
    }
    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
