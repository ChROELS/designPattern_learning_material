package com.example.factoryDesign;

import com.example.factoryDesign.factory.EnemyShipFactory;
import com.example.factoryDesign.models.EnemyShip;
import com.example.factoryDesign.models.UFOEnemyShip;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class EnemyShipTesting {
    EnemyShipFactory enemyShipFactory;
    EnemyShip enemyShip;
    @Before
    public void initializeFactory(){
        enemyShipFactory= new EnemyShipFactory();
        enemyShip = enemyShipFactory.makeEnemyShip("U") ;
    }
    @Test
    public void createFactory(){
        assertNotNull("Factory has not been created",enemyShipFactory);
    }
    @Test
    public void createEnemyShip(){
        Assert.assertEquals("Wrong type of ship",new UFOEnemyShip().getName(),enemyShip.getName());
    }
    @After
    public void attack(){
        enemyShip.displayEnemyShip();
        enemyShip.followHeroShip();
        enemyShip.enemyShipShoots();
    }
}
