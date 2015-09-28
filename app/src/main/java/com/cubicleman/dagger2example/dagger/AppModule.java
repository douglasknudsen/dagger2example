package com.cubicleman.dagger2example.dagger;

import android.content.Context;

import com.cubicleman.dagger2example.DaggerApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @since 9/27/15.
 */

@Module
public class AppModule {

    private final DaggerApplication application;

    public AppModule( DaggerApplication application )   {
        this.application = application;
    }


    @Provides
    @Singleton
    Context provideApplicationContext() {
        return this.application;
    }



}
