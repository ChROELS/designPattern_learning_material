package com.example.templateDesignMe;

public class FitnessWorkoutDelivery {
    public static void main(String[] args) {
        //We only have to declare and initialize a FitnessWorkout object
        //according to what kind of workout we want to complete
        FitnessWorkout myWorkout;
        myWorkout = new UpperBodyWorkout();
        //Then, call the main method createWorkout()
        myWorkout.createWorkout();
    }
}
