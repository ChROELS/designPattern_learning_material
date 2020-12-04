package com.example.templateDesignMe;

public class TotalBodyWorkout extends FitnessWorkout {
    //all hooks methods in FitnessWorkout class stay the same (set to true)
    @Override
    void setLegsCircuit() {
        for (String exo: super.getLegsExercises()
             ) {
            System.out.printf("Legs circuit: %s %n",exo);
            System.out.println("*".repeat(20));
        }
    }

    @Override
    void setArmsCircuit() {
        for (String exo: super.getArmsExercises()
        ) {
            System.out.printf("Arms circuit: %s %n",exo);
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

    @Override
    void setBackCircuit() {
        for (String exo: super.getCoreExercises()
        ) {
            System.out.printf("Back circuit: %s %n",exo);
            System.out.println("*".repeat(20));
        }
    }
}
