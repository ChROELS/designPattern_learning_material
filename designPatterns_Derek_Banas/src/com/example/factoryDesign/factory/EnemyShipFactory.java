package com.example.factoryDesign.factory;

import com.example.factoryDesign.models.BigUFOEnemyShip;
import com.example.factoryDesign.models.EnemyShip;
import com.example.factoryDesign.models.RocketEnemyShip;
import com.example.factoryDesign.models.UFOEnemyShip;

//By encapsulating ship creation, we only have one place to make modifications
public class EnemyShipFactory {
    // This could be used as a static method if we are willing to give up subclassing it
    public EnemyShip makeEnemyShip(String newShipType){
        EnemyShip enemyShip = null;
        switch(newShipType){
            case "U": enemyShip= new UFOEnemyShip(); break;
            case "R": enemyShip= new RocketEnemyShip(); break;
            case "B": enemyShip= new BigUFOEnemyShip(); break;
        }
        return enemyShip;
    }
}
