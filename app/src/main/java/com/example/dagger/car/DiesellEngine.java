package com.example.dagger.car;

import android.util.Log;

import javax.inject.Inject;

public class DiesellEngine implements Engine {
    private static final String TAG = "Car";
    private int horsePower;
    @Inject
    public DiesellEngine(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void start() {

        Log.d(TAG, "Diesel Engine started. Horsepower: "+ horsePower);
    }
}
