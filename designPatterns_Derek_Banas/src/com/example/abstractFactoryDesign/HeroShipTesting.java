package com.example.abstractFactoryDesign;

import com.example.abstractFactoryDesign.builders.HeroSpecialShipBuilding;
import com.example.abstractFactoryDesign.builders.HeroShipBuilding;
import com.example.abstractFactoryDesign.models.HeroShip;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HeroShipTesting {
    HeroShipBuilding heroShipBuilding;
    HeroShip rocketShip;
    HeroShip bigUFOShip;
    @Before
    public void callBuildersOfShip(){
        heroShipBuilding = new HeroSpecialShipBuilding();
    }
    @Test
    public void makeRocketShip(){
        rocketShip = heroShipBuilding.orderShip("Rocket");
        Assert.assertNotNull("Object has not been created", rocketShip);
    }
    @Test
    public void makeUFOShip(){
        bigUFOShip = heroShipBuilding.orderShip("BigUFO");
        Assert.assertNotNull("Object has not been created", bigUFOShip);
    }
}
