package com.example.decoratorDesign.toppingsDecoratorImpl;

import com.example.decoratorDesign.Pizza;
import com.example.decoratorDesign.ToppingsDecorator;

public class Mozzarella extends ToppingsDecorator {

    public Mozzarella(Pizza base) {
        super(base);
    }
    @Override
    public String getDescription(){
        return super.getDescription() + " + mozzarella";
    }
    @Override
    public double getCost(){
        return super.getCost() + 1.3;
    }

}
