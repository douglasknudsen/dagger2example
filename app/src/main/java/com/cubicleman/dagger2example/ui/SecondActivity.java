package com.cubicleman.dagger2example.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.cubicleman.dagger2example.dagger.AppComponent;
import com.cubicleman.dagger2example.dagger.DaggerSubActivityComponent;
import com.cubicleman.dagger2example.model.ModelOne;
import com.cubicleman.dagger2example.R;
import com.cubicleman.dagger2example.dagger.SubActivityModule;
import com.cubicleman.dagger2example.command.CommandSample;

import javax.inject.Inject;

import timber.log.Timber;

/**
 * @since 9/27/15.
 */

public class SecondActivity extends ActivityGroup {

    @Inject
    ModelOne modelOne;

    @Inject
    CommandSample commandSample;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getGraph().inject(this);

        setContentView(R.layout.second_activity);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ((Button)findViewById(R.id.button_togo)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondActivity.this, ThirdActivity.class));
            }
        });

        ((TextView)findViewById(R.id.second_text)).setText("modelOne.foo=" + modelOne.getFoo());


        Timber.d("SecondActivity setup : %s", modelOne.getFoo());
    }


}
