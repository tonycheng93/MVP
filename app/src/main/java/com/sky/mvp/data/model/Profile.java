package com.sky.mvp.data.model;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

import android.os.Parcelable;
import android.support.annotation.Nullable;

import java.util.Date;

/**
 * 项目名称：MVP 类描述： 创建人：tonycheng 创建时间：2017/2/2 14:41 邮箱：tonycheng93@outlook.com 修改人： 修改时间： 修改备注：
 */
@AutoValue
public abstract class Profile implements Parcelable {

    public abstract Name name();

    public abstract String email();

    public abstract String hexColor();

    public abstract Date dateOfBirth();

    @Nullable
    public abstract String bio();

    @Nullable
    public abstract String avatar();

    public static Builder builder() {
        return new AutoValue_Profile.Builder();
    }

    public static TypeAdapter<Profile> typeAdapter(Gson gson) {
        return new AutoValue_Profile.GsonTypeAdapter(gson);
    }

    @AutoValue.Builder
    public abstract static class Builder {
        public abstract Builder setName(Name name);

        public abstract Builder setEmail(String email);

        public abstract Builder setHexColor(String hexColor);

        public abstract Builder setDateOfBirth(Date dateOfBirth);

        public abstract Builder setBio(String bio);

        public abstract Builder setAvatar(String avatar);

        public abstract Profile build();
    }
}
