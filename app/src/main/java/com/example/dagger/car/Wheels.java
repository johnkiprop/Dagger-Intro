package com.example.dagger.car;

public class Wheels {
    private Rims rims;
    private Tyres tyres;
    //cannot inject as we don't own the class. Like third-party libraries
    public Wheels(Rims rims, Tyres tyres) {
        this.rims = rims;
        this.tyres = tyres;
    }
}
