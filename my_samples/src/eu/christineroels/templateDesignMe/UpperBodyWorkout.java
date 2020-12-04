package com.example.templateDesignMe;

public class UpperBodyWorkout extends FitnessWorkout {
    //We are changing the implementations of two hooks methods to create a workout
    //targeting the upper body
    @Override
    public boolean targetBack() {
        return false;
    }
    @Override
    public boolean targetLegs() {
        return false;
    }
    //these two methods are not to be implemented because they won't be executed once we create the workout
    @Override
    void setLegsCircuit() {
    }
    @Override
    void setBackCircuit() {
    }
    //Slightly different implementations of these two methods than in TotalBodyWorkout

    @Override
    void setArmsCircuit() {
        for (String exo : super.getArmsExercises()
        ) {
            System.out.printf("Arms circuit : %s %n", exo);
            System.out.println("*".repeat(20));
        }
    }
    @Override
    void setCoreCircuit() {
        for (String exo: super.getCoreExercises()
        ) {
            System.out.printf("Core circuit: %s %n",exo);
            System.out.println("*".repeat(20));
        }
    }




}
