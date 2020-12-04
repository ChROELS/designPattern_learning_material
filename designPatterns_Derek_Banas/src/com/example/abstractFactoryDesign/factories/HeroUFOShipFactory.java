package com.example.abstractFactoryDesign.factories;

import com.example.abstractFactoryDesign.models.engines.HeroEngine;
import com.example.abstractFactoryDesign.models.engines.HeroUFOEngine;
import com.example.abstractFactoryDesign.models.weapons.HeroUFOLaser;
import com.example.abstractFactoryDesign.models.weapons.HeroWeapon;

public class HeroUFOShipFactory implements HeroShipFactory {
    @Override
    public HeroWeapon addHeroWeapon() {
        return new HeroUFOLaser();
    }

    @Override
    public HeroEngine addHeroEngine() {
        return new HeroUFOEngine();
    }
}
