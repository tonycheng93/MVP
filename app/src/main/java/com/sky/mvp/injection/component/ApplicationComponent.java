package com.sky.mvp.injection.component;

import android.app.Application;
import android.content.Context;

import com.sky.mvp.data.DataManager;
import com.sky.mvp.data.SyncService;
import com.sky.mvp.data.local.DatabaseHelper;
import com.sky.mvp.data.local.PreferencesHelper;
import com.sky.mvp.data.remote.RibotsService;
import com.sky.mvp.injection.ApplicationContext;
import com.sky.mvp.injection.module.ApplicationModule;
import com.sky.mvp.util.RxEventBus;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(SyncService syncService);

    @ApplicationContext
    Context context();
    Application application();
    RibotsService ribotsService();
    PreferencesHelper preferencesHelper();
    DatabaseHelper databaseHelper();
    DataManager dataManager();
    RxEventBus eventBus();

}
