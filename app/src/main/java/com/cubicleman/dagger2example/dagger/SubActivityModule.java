package com.cubicleman.dagger2example.dagger;

import com.cubicleman.dagger2example.model.ModelOne;

import dagger.Module;
import dagger.Provides;
import timber.log.Timber;

/**
 * @since 9/28/15.
 */

@Module
public class SubActivityModule {


    public SubActivityModule() {
        Timber.d("sdfasdf");
    }

    @Provides
    @PerActivity
    ModelOne provideModelOne() {
        return new ModelOne("SubModule instance");
    }
}
