package com.graphicalinfo.myapplication;

import android.app.Application;
import android.content.Context;


/**
 * Created by ayoob on 04/07/2017.
 */

public class App extends Application {

    private Context context;
    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public Context getContext(){
        return context;
    }


}
