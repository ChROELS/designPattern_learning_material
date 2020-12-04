package com.example.abstractFactoryDesign.builders;

import com.example.abstractFactoryDesign.models.HeroShip;

public abstract class HeroShipBuilding {
     protected abstract HeroShip makeHeroShip(String typeOfShip);
     public HeroShip orderShip(String typeOfShip){
         HeroShip heroShip = makeHeroShip(typeOfShip);
         heroShip.makeShip();
         heroShip.displayHeroShip();
         heroShip.followEnemyShip();
         heroShip.heroShipShoots();
         return heroShip;
     }
}
