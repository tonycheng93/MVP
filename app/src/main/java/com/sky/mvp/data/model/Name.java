package com.sky.mvp.data.model;

import android.os.Parcelable;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/**
 * 项目名称：MVP
 * 类描述：
 * 创建人：tonycheng
 * 创建时间：2017/2/2 14:40
 * 邮箱：tonycheng93@outlook.com
 * 修改人：
 * 修改时间：
 * 修改备注：
 */
@AutoValue
public abstract class Name implements Parcelable{
    public abstract String first();
    public abstract String last();

    public static Name create(String first, String last) {
        return new AutoValue_Name(first, last);
    }

    public static TypeAdapter<Name> typeAdapter(Gson gson) {
        return new AutoValue_Name.GsonTypeAdapter(gson);
    }
}
