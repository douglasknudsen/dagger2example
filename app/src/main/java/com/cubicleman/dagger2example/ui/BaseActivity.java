package com.cubicleman.dagger2example.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.cubicleman.dagger2example.dagger.AppComponent;
import com.cubicleman.dagger2example.DaggerApplication;

/**
 * @since 9/27/15.
 */
public abstract class BaseActivity extends AppCompatActivity {

//  can't inject this here!
//    @Inject
//    BigModel bigModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupComponent( ((DaggerApplication)getApplication()).getApplicationComponent() );
    }


    protected abstract void setupComponent(AppComponent appComponent);

}
