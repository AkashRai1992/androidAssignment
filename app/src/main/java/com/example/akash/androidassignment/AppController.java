package com.example.akash.androidassignment;

import android.app.Application;

import timber.log.Timber;

/**
 * Created by akash on 5/8/16.
 */
public class AppController extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Timber.plant(new Timber.DebugTree());
    }
}
