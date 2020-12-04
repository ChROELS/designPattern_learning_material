package com.example.abstractFactoryDesign.factories;

import com.example.abstractFactoryDesign.models.engines.HeroEngine;
import com.example.abstractFactoryDesign.models.weapons.HeroWeapon;

public interface HeroShipFactory {
    public HeroWeapon addHeroWeapon();
    public HeroEngine addHeroEngine();
}
