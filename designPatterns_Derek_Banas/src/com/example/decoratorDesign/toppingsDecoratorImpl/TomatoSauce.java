package com.example.decoratorDesign.toppingsDecoratorImpl;

import com.example.decoratorDesign.Pizza;
import com.example.decoratorDesign.ToppingsDecorator;

public class TomatoSauce extends ToppingsDecorator {

    public TomatoSauce(Pizza base) {
        super(base);
    }
    @Override
    public String getDescription(){
        return super.getDescription() + " + tomato sauce";
    }
    @Override
    public double getCost(){
        return super.getCost() + 1.0;
    }

}
