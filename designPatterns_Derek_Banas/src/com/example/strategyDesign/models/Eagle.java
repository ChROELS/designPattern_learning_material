package com.example.strategyDesign.models;

import com.example.strategyDesign.behaviors.Hops;
import com.example.strategyDesign.behaviors.PredatorFlight;

public class Eagle extends Animal {
    private double wingsLength;

    public Eagle(double wingsLength){

        this.wingsLength = wingsLength;
        flyingType = new PredatorFlight();
        jumpingType = new Hops();
    }

    public double getWingsLength() {
        return wingsLength;
    }

    public void setWingsLength(double wingsLength) {
        this.wingsLength = wingsLength;
    }

}
