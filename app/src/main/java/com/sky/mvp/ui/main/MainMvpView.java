package com.sky.mvp.ui.main;

import com.sky.mvp.data.model.Ribot;
import com.sky.mvp.ui.base.MvpView;

import java.util.List;

/**
 * 项目名称：MVP
 * 类描述：
 * 创建人：tonycheng
 * 创建时间：2017/2/2 16:03
 * 邮箱：tonycheng93@outlook.com
 * 修改人：
 * 修改时间：
 * 修改备注：
 */

public interface MainMvpView extends MvpView {
    void showRibots(List<Ribot> ribots);

    void showRibotsEmpty();

    void showError();
}
