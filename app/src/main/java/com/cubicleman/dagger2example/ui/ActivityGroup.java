package com.cubicleman.dagger2example.ui;

import com.cubicleman.dagger2example.dagger.AppComponent;
import com.cubicleman.dagger2example.dagger.DaggerSubActivityComponent;
import com.cubicleman.dagger2example.dagger.SubActivityComponent;
import com.cubicleman.dagger2example.dagger.SubActivityModule;

/**
 * @since 9/29/15.
 */
public class ActivityGroup extends BaseActivity {

    //allows sharing a graph between related activities
    private static SubActivityComponent activityComponent;

    @Override
    protected void setupComponent(AppComponent appComponent) {
        if(activityComponent == null) {
            activityComponent = DaggerSubActivityComponent.builder()
                    .appComponent(appComponent)
                    .subActivityModule(new SubActivityModule())
                    .build();
        }

    }

    protected SubActivityComponent getGraph()   {
        return activityComponent;
    }


}
