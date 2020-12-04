package com.example.decoratorDesign.toppingsDecoratorImpl;

import com.example.decoratorDesign.Pizza;
import com.example.decoratorDesign.ToppingsDecorator;

public class Pineapple extends ToppingsDecorator {

    public Pineapple(Pizza base) {

        super(base);
    }
    @Override
    public String getDescription(){
        return super.getDescription() + " + pineapple slices";
    }
    @Override
    public double getCost(){
        return super.getCost() + 1.2;
    }

}
