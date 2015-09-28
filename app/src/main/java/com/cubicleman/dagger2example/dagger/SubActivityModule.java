package com.cubicleman.dagger2example.dagger;

import com.cubicleman.dagger2example.model.ModelOne;

import dagger.Module;
import dagger.Provides;

/**
 * @since 9/28/15.
 */

@Module
public class SubActivityModule {


    public SubActivityModule() {
    }

    @Provides
    @PerActivity
    ModelOne provideModelOne() {
        return new ModelOne("SubModule instance");
    }
}
