package com.example.dagger.dagger;


import com.example.dagger.MainActivity;
import com.example.dagger.car.Car;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;

@PerActivity
@Subcomponent(modules = {WheelsModule.class, DieselEngineModule.class})
public interface ActivityComponent {
    //below is for constructor injection
    Car getCar();
    //for field injection
    void inject(MainActivity mainActivity);
    /*
    @Component.Builder
    interface Builder{
        @BindsInstance
        Builder horsePower(@Named ("horse power") int horsePower);
        @BindsInstance
        Builder capacity(@Named("Engine capacity") int capacity);

        Builder appComponent(AppComponent appComponent);
        ActivityComponent build();

    }*/


}
