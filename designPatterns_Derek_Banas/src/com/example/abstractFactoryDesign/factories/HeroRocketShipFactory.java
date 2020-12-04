package com.example.abstractFactoryDesign.factories;

import com.example.abstractFactoryDesign.models.engines.HeroEngine;
import com.example.abstractFactoryDesign.models.engines.HeroRocketEngine;
import com.example.abstractFactoryDesign.models.weapons.HeroRocketLauncher;
import com.example.abstractFactoryDesign.models.weapons.HeroWeapon;

public class HeroRocketShipFactory implements HeroShipFactory {
    @Override
    public HeroWeapon addHeroWeapon() {
        return new HeroRocketLauncher();
    }

    @Override
    public HeroEngine addHeroEngine() {
        return new HeroRocketEngine();
    }
}
