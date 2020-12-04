package com.example.decoratorDesign;

public abstract class ToppingsDecorator implements Pizza{
    //Association. In this case, an aggregation
    private final Pizza base;

    public ToppingsDecorator(Pizza base) {
        this.base = base;
    }

    @Override
    public String getDescription() {
        //"Thin dough"
        return base.getDescription();
    }

    @Override
    public double getCost() {
        return base.getCost();
    }
}
