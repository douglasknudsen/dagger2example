package com.cubicleman.dagger2example.dagger;

import com.cubicleman.dagger2example.model.ModelOne;
import com.cubicleman.dagger2example.ui.MainActivity;

import dagger.Module;
import dagger.Provides;

/**
 * @since 9/27/15.
 */
@Module
public class ActivityModule {

    private final MainActivity mainActivity;

    public ActivityModule( MainActivity mainActivity )   {
        this.mainActivity = mainActivity;
    }

    @Provides
    @PerActivity
    ModelOne provideModelOne() {
        return new ModelOne( "Created in Main");
    }
}


