package com.example.strategyDesign.models;


import com.example.strategyDesign.behaviors.JumpWide;
import com.example.strategyDesign.behaviors.NoFlight;

public class Horse extends Animal {
    private double legsLength;
    private static final int HOWMANYLEGS=4;


    public Horse(double legsLength){
        super();
        this.legsLength = Math.abs(legsLength);
        flyingType = new NoFlight();
        jumpingType = new JumpWide();
    }

    public double getLegsLength() {
        return legsLength;
    }

    public void setLegsLength(double legsLength) {
        this.legsLength = legsLength;
    }
}
