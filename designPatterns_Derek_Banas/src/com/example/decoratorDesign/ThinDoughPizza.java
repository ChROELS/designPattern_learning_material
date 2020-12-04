package com.example.decoratorDesign;

public class ThinDoughPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Thin dough";
    }

    @Override
    public double getCost() {
        return 5.0;
    }
}
