package com.example.strategyDesign.behaviors;

public class PredatorFlight implements Fly{
    @Override
    public String fly() {
        return " flies over and then dives on another animal.";
    }
}
