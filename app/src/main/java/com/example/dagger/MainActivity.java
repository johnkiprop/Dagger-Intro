package com.example.dagger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.dagger.car.Car;
import com.example.dagger.dagger.ActivityComponent;
import com.example.dagger.dagger.DieselEngineModule;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity {
@Inject
Car car1, car2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityComponent component = ((ExampleApp)getApplication()).getAppComponent()
                .activityComponent(new DieselEngineModule(120));

       //this is for constructor injection  car = component.getCar();
        //for field injection

        component.inject(this);

        car1.drive();
        car2.drive();
    }
}
