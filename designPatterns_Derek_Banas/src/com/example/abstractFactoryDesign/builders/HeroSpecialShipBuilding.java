package com.example.abstractFactoryDesign.builders;

import com.example.abstractFactoryDesign.factories.HeroBigUFOShipFactory;
import com.example.abstractFactoryDesign.factories.HeroRocketShipFactory;
import com.example.abstractFactoryDesign.factories.HeroShipFactory;
import com.example.abstractFactoryDesign.factories.HeroUFOShipFactory;
import com.example.abstractFactoryDesign.models.HeroShip;
import com.example.abstractFactoryDesign.models.types.HeroUFOShip;

public class HeroSpecialShipBuilding extends HeroShipBuilding {
    @Override
    protected HeroShip makeHeroShip(String typeOfShip) {
        HeroShip heroShip = null;
        if(typeOfShip.equals("Rocket")){
            HeroShipFactory shipsPartsFactory = new HeroRocketShipFactory();
            heroShip = new HeroUFOShip(shipsPartsFactory);
            heroShip.setName("Rocket 001 - AA Ship");
        }
            else if(typeOfShip.equals("UFO")){
                HeroShipFactory shipsPartsFactory = new HeroUFOShipFactory();
                heroShip = new HeroUFOShip(shipsPartsFactory);
                heroShip.setName("UFO 001 Ship");
            }
            else if(typeOfShip.equals("BigUFO")) {
                HeroShipFactory shipsPartsFactory = new HeroBigUFOShipFactory();
                heroShip = new HeroUFOShip(shipsPartsFactory);
                heroShip.setName("Big UFO ABC Ship");
            }
        return heroShip;
    }
}
