package com.example.decoratorDesign.toppingsDecoratorImpl;

import com.example.decoratorDesign.Pizza;
import com.example.decoratorDesign.ToppingsDecorator;

public class Ham extends ToppingsDecorator {
    //constructor chaining through inheritance, mandatory because there is an explicit constructor in ToppingsDecorator
    public Ham(Pizza base) {
        super(base);
    }
    //override methods
    @Override
    public String getDescription(){
        return super.getDescription() + " + ham dices";
    }
    @Override
    public double getCost(){
        return super.getCost() + 1.4;
    }

}
