package com.example.strategyDesign;



import com.example.strategyDesign.behaviors.PredatorFlight;
import com.example.strategyDesign.models.Animal;
import com.example.strategyDesign.models.Eagle;
import com.example.strategyDesign.models.Horse;
import org.junit.Before;
import org.junit.Test;

public class FlysAndJumpsTest {
    private Animal horse;
    private Animal eagle;

    @Before
    public void createAnimals(){
        horse = new Horse(170);
        horse.setName("BoJack");
        eagle = new Eagle(150);
        eagle.setName("Theodore");
    }
    @Test
    public void makeJump(){
        System.out.println(horse.getName() +" the horse"+ horse.tryToJump());
        System.out.println(eagle.getName() +" the eagle"+ eagle.tryToJump());
    }
    @Test
    public void makeFly(){
        System.out.println(horse.getName() + horse.tryToFly());
        System.out.println(eagle.getName() + eagle.tryToFly());
    }
    //Dynamically change the behavior
    @Test
    public void alternateUniverse(){
        horse.setFlyingType(new PredatorFlight());
        System.out.println("In an alternate universe, "+ horse.getName()+" the horse" + horse.tryToFly());
    }
}
