package com.example.templateDesignMe;

public class LowerBodyWorkout extends FitnessWorkout {
    //We are changing the implementations of two hooks methods to create a workout
    //targeting the lower body
    @Override
    public boolean targetArms() {
        return false;
    }
    @Override
    public boolean targetCore() {
        return false;
    }
    //these methods won't be executed while creating this workout variation
    @Override
    void setArmsCircuit() {
    }
    @Override
    void setCoreCircuit() {
    }
    //Slightly different implementations of these methods than in other subclasses
    @Override
    void setLegsCircuit() {
        for (String exo: super.getLegsExercises()
        ) {
            System.out.println("Legs circuit 3x:");
            System.out.printf("%s %n",exo);
        }
    }
    @Override
    void setBackCircuit() {
        for (String exo: super.getBackExercises()
        ) {
            System.out.println("Back circuit 3x:");
            System.out.printf("%s %n",exo);
        }
    }
}
