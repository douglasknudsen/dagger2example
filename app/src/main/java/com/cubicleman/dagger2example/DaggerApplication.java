package com.cubicleman.dagger2example;

import android.app.Application;

import com.cubicleman.dagger2example.dagger.AppComponent;
import com.cubicleman.dagger2example.dagger.AppModule;
import com.cubicleman.dagger2example.dagger.DaggerAppComponent;
import com.cubicleman.dagger2example.model.BigModel;

import javax.inject.Inject;

import timber.log.Timber;

/**
 * @since 9/27/15.
 */
public class DaggerApplication extends Application {


    @Inject
    BigModel bigModel;

    @Override
    public void onCreate() {
        super.onCreate();

        Timber.plant(new Timber.DebugTree());

        initializeInjector();

        applicationComponent.inject(this);

        Timber.d("APP STARTED!");
    }

    private AppComponent applicationComponent;

    private void initializeInjector() {
        this.applicationComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();

    }

    public AppComponent getApplicationComponent() {
        return this.applicationComponent;
    }
}
