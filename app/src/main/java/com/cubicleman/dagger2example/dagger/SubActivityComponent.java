package com.cubicleman.dagger2example.dagger;

import com.cubicleman.dagger2example.model.ModelOne;
import com.cubicleman.dagger2example.command.CommandSample;
import com.cubicleman.dagger2example.ui.SecondActivity;
import com.cubicleman.dagger2example.ui.ThirdActivity;

import dagger.Component;

/**
 * @since 9/28/15.
 */

@PerActivity
@Component(dependencies = AppComponent.class, modules = { SubActivityModule.class, CommandModule.class})
public interface SubActivityComponent {

    void inject(SecondActivity secondActivity);
    void inject(ThirdActivity secondActivity);


    ModelOne modelOne();
    CommandSample commandSample();
}
