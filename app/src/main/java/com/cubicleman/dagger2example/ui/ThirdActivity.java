package com.cubicleman.dagger2example.ui;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.cubicleman.dagger2example.R;
import com.cubicleman.dagger2example.command.CommandSample;
import com.cubicleman.dagger2example.dagger.AppComponent;
import com.cubicleman.dagger2example.dagger.DaggerSubActivityComponent;
import com.cubicleman.dagger2example.dagger.SubActivityModule;
import com.cubicleman.dagger2example.model.ModelOne;
import com.cubicleman.dagger2example.model.ModelTwo;

import javax.inject.Inject;

import timber.log.Timber;

/**
 * @since 9/27/15.
 */
public class ThirdActivity extends ActivityGroup {

    @Inject
    ModelOne modelOne;

    @Inject
    ModelTwo modelTwo;

    @Inject
    CommandSample commandSample;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getGraph().inject(this);
        setContentView(R.layout.third_activity);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ((TextView)findViewById(R.id.third_text)).setText("modelOne.foo=" + modelOne.getFoo());


        Timber.d("ThirdActivity setup : %s", modelOne.getFoo());
    }
}
