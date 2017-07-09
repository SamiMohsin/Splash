package com.graphicalinfo.myapplication;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import butterknife.ButterKnife;
import me.anwarshahriar.calligrapher.Calligrapher;

/**
 * Created by ayoob on 04/07/2017.
 */

public abstract class BaseActivity extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        ButterKnife.bind(this);
        Calligrapher calligrapher = new Calligrapher(this);
        calligrapher.setFont(this, "fonts/OpenSans-Regular.ttf", true);
        Toolbar toolbar = (Toolbar) findViewById(getToolbar());
        setSupportActionBar(toolbar);
        setTitle("");

    }

    @IdRes
    protected abstract int getToolbar();

    @LayoutRes
    protected abstract int getLayout();
}
