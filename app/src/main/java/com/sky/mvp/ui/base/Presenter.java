package com.sky.mvp.ui.base;

/**
 * 项目名称：MVP
 * 类描述：
 * 创建人：tonycheng
 * 创建时间：2017/2/2 16:00
 * 邮箱：tonycheng93@outlook.com
 * 修改人：
 * 修改时间：
 * 修改备注：
 */

public interface Presenter<V extends MvpView> {
    void attachView(V mvpView);

    void detachView();
}
