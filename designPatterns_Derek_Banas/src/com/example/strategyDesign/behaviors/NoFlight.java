package com.example.strategyDesign.behaviors;

public class NoFlight implements Fly{
    @Override
    public String fly() {
        return " has not the ability to fly.";
    }
}
