package com.sky.mvp.data.model;

import android.os.Parcelable;
import android.support.annotation.NonNull;

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
public abstract class Ribot implements Comparable<Ribot>,Parcelable{

    public abstract Profile profile();

    public static Ribot create(Profile profile) {
        return new AutoValue_Ribot(profile);
    }

    public static TypeAdapter<Ribot> typeAdapter(Gson gson) {
        return new AutoValue_Ribot.GsonTypeAdapter(gson);
    }
    @Override
    public int compareTo(@NonNull Ribot another) {
        return profile().name().first().compareToIgnoreCase(another.profile().name().first());
    }
}
