package com.example.dagger.dagger;

import com.example.dagger.car.Rims;
import com.example.dagger.car.Tyres;
import com.example.dagger.car.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {
    @Provides
   static Rims provideRims(){
        return new Rims();
    }
    @Provides
   static Tyres provideTyres(){
        Tyres tyres = new Tyres();
        tyres.inflate();
        return tyres;
    }
    @Provides
   static Wheels provideWheels(Rims rims, Tyres tyres){
        return new Wheels(rims, tyres);
    }
}
