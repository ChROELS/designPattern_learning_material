package com.example.abstractFactoryDesign.models;

import com.example.abstractFactoryDesign.models.engines.HeroEngine;
import com.example.abstractFactoryDesign.models.weapons.HeroWeapon;

public abstract class HeroShip {
    private String name;

    HeroWeapon weapon;
    HeroEngine engine;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HeroWeapon getWeapon() {
        return weapon;
    }

    public void setWeapon(HeroWeapon weapon) {
        this.weapon = weapon;
    }

    public HeroEngine getEngine() {
        return engine;
    }

    public void setEngine(HeroEngine engine) {
        this.engine = engine;
    }
    //Abstract method
    public abstract void makeShip();
    //Objects methods
    public void followEnemyShip(){
        System.out.println(getName() + " is following the enemy at "+ engine +" speed");
    }
    public void displayHeroShip(){
        System.out.println(getName() + " is on the screen");
    }
    public void heroShipShoots(){
        System.out.println(getName() +" attacks and fires with a "+ weapon);
    }
    //Overriden methods

    @Override
    public String toString() {
        return "HeroShip{" +
                "name='" + name + '\'' +
                ", weapon=" + weapon +
                ", engine=" + engine +
                '}';
    }
}
