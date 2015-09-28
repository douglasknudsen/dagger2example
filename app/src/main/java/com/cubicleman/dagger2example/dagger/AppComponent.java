package com.cubicleman.dagger2example.dagger;

import android.content.Context;

import com.cubicleman.dagger2example.DaggerApplication;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @since 9/27/15.
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {


    void inject( DaggerApplication application );

    Context context();


}
