package com.example.PrototypeDesign;

import com.example.PrototypeDesign.factories.CloneFactory;
import com.example.PrototypeDesign.models.Animal;
import com.example.PrototypeDesign.models.Sheep;
import org.junit.Before;
import org.junit.Test;

public class TestCloning {
    CloneFactory factory;
    Sheep dolly;
    @Before
    public void initializeCloneFactory(){
        factory = new CloneFactory();
    }
    @Before
    public void createASheep(){
        dolly = new Sheep();
        dolly.setName("Dolly");
    }
    @Test
    public void duplicateDolly(){
        Animal clonedSheep = factory.getClone(dolly);
        //If I want to change the name property of the object
        ((Sheep) clonedSheep).setName("Dolly II");
        System.out.println(dolly);
        System.out.println(clonedSheep);
        System.out.println("System Identity hashcode of Dolly: "+ System.identityHashCode(dolly));
        System.out.println("hashcode "+ dolly.hashCode());
        System.out.println("System Identity hashcode of Dolly II: "+ System.identityHashCode(clonedSheep));
        System.out.println("hashcode "+ clonedSheep.hashCode());
    }


}
