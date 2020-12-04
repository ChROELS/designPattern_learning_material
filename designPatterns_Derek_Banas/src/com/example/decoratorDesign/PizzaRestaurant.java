package com.example.decoratorDesign;

import com.example.decoratorDesign.toppingsDecoratorImpl.Ham;
import com.example.decoratorDesign.toppingsDecoratorImpl.Mozzarella;
import com.example.decoratorDesign.toppingsDecoratorImpl.Pineapple;
import com.example.decoratorDesign.toppingsDecoratorImpl.TomatoSauce;

public class PizzaRestaurant {
    public static void main(String[] args) {
        //Constructor takes a Pizza object for parameter, dynamically instantiated at runtime
        Pizza myOrder = new Pineapple(new Ham(new Mozzarella(new TomatoSauce(new ThinDoughPizza()))));
        System.out.println(myOrder.getDescription());
        System.out.println(myOrder.getCost()+ " euros");
        System.out.printf("%.2f euros %n",myOrder.getCost());
        System.out.println(Math.round(myOrder.getCost() )+ " euros");
    }
}
