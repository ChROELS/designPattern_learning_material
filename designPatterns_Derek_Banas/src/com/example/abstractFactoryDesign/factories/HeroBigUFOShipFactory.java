package com.example.abstractFactoryDesign.factories;

import com.example.abstractFactoryDesign.models.engines.HeroBigUFOEngine;
import com.example.abstractFactoryDesign.models.engines.HeroEngine;
import com.example.abstractFactoryDesign.models.weapons.HeroBigUFOLaser;
import com.example.abstractFactoryDesign.models.weapons.HeroWeapon;

public class HeroBigUFOShipFactory implements HeroShipFactory {
    @Override
    public HeroWeapon addHeroWeapon() {
        return new HeroBigUFOLaser();
    }

    @Override
    public HeroEngine addHeroEngine() {
        return new HeroBigUFOEngine();
    }
}
