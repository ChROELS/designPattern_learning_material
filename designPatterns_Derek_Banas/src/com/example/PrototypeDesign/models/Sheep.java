package com.example.PrototypeDesign.models;

/**
 * In this class used to determine what type of instances we want to duplicate,
 * we have to call the method clone() from the super interface Cloneable
 */
public class Sheep implements Animal{
    private String name;
    private final int geneticID;
    public Sheep(){
        System.out.println("This is the constructor implementation. A cloneable sheep is made.");
        this.geneticID=12546889;
    }

    public int getGeneticID() {
        return geneticID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Animal createClone() {
        System.out.println("A cloned sheep is being made.");
        Sheep sheep = null;
        try{
            sheep = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("The cloning method failed!");
            e.printStackTrace();
        }
        return sheep;
    }

    @Override
    public String toString() {
        return "Sheep: "+ name + ".Genetic ID: "+geneticID;
    }
}
