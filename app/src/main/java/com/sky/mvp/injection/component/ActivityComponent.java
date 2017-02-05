package com.sky.mvp.injection.component;

import com.sky.mvp.ui.main.MainActivity;
import com.sky.mvp.injection.PerActivity;
import com.sky.mvp.injection.module.ActivityModule;

import dagger.Subcomponent;

/**
 * This component inject dependencies to all Activities across the application
 */
@PerActivity
@Subcomponent(modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

}
