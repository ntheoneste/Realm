package com.example.realmtn;

import android.app.Application;

import io.realm.Realm;

public class Initializer extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
    }
}
