package com.example.abstractFactoryDesign.models.types;

import com.example.abstractFactoryDesign.factories.HeroShipFactory;
import com.example.abstractFactoryDesign.models.HeroShip;
import com.example.abstractFactoryDesign.models.engines.HeroEngine;
import com.example.abstractFactoryDesign.models.weapons.HeroWeapon;

public class HeroUFOShip extends HeroShip {
    HeroShipFactory heroShipFactory;

    public HeroUFOShip(HeroShipFactory heroShipFactory){
        this.heroShipFactory = heroShipFactory;
    }

    public void makeShip(){
        System.out.println("Making Hero ship of type '" +getName()+"'" );
        setWeapon(heroShipFactory.addHeroWeapon());
        setEngine(heroShipFactory.addHeroEngine());
    }
}
