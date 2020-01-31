package com.example.dagger.car;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class PetrolEngine implements Engine {
    private static final String TAG = "Car";
    int horsepower;
    int capacity;
    @Inject
    public PetrolEngine(@Named("horse power") int horsepower,@Named("Engine capacity") int capacity) {
        this.horsepower = horsepower;
        this.capacity = capacity;
    }

    @Override
    public void start() {
        Log.d(TAG, "Petrol Engine started. Horsepower: "+horsepower +"\n Capacity: "+ capacity);
    }
}
