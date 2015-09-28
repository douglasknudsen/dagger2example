package com.cubicleman.dagger2example.dagger;

import com.cubicleman.dagger2example.model.ModelOne;
import com.cubicleman.dagger2example.ui.MainActivity;

import dagger.Component;

/**
 * @since 9/27/15.
 */
@PerActivity
@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject( MainActivity mainActivity);

    //this will be a instance shared by the injects listed above
    //the modelOne in SubActivityComponent wil be a DIFFERENT instance
    ModelOne modelOne();
}
