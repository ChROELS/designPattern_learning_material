package com.example.strategyDesign.models;

import com.example.strategyDesign.behaviors.Fly;
import com.example.strategyDesign.behaviors.Jump;

public class Animal {
    private String name;
    private Double height;
    private double weight;
    private String favFood;
    private String sound;
    private int age;
    // Composition allows you to change the capabilities of objects at run time!
    public Fly flyingType;
    public Jump jumpingType;

    //Keeping the default constructor

    //getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getHeight() {
        return height;
    }
    public void setHeight(Double height) {
        if(height<0) {
            this.height = Math.abs(height);
        }
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        if(weight<0) {
            this.weight = Math.abs(weight);
        }
    }
    public String getFavFood() {
        return favFood;
    }
    public void setFavFood(String favFood) {
        this.favFood = favFood;
    }
    public String getSound() {
        return sound;
    }
    public void setSound(String sound) {
        this.sound = sound;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    //dynamic setter for Fly and Jump variables
    public void setFlyingType(Fly flyingType) {
        this.flyingType = flyingType;
    }
    public void setJumpingType(Jump jumpingType){
        this.jumpingType = jumpingType;
    }
    //method to perform a flight
    public String tryToFly(){
        return flyingType.fly();
    }
    //method to perform a jump
    public String tryToJump(){
        return jumpingType.jump();
    }
}
