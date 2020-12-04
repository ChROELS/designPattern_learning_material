package com.example.templateDesignMe;

//A template design pattern makes use of an abstract class with a main final method calling abstract methods
// to override in subclasses and calling
// methods that are called hooks, to override with design objectives in mind (it is optional to override them,
// it depends on what we want to see for implementation by the subclasses).
public abstract class FitnessWorkout {
    //Not part of the template design pattern, some common properties of all subclasses
    private final String[] legsExercices = {"10 Jumping jacks","20 squats", "20 lunges", "20 brides"};
    private final String[] armsExercices = {"1min plank", "10 push-ups", "10 burpees", "10 triceps- dips"};
    private final String[] coreExercices = {"20 imprints", "10 flutter kicks", "20 alternate heels touches", "30 crunches"};
    private final String[] backExercices = {"10 Froggy legs raises", "10 back bows", "20 torso twists"};


    //This is the main function that we are aiming for in our app: to create workouts
    //It is declared final to avoid new implementations in the subclasses
    public final void createWorkout(){
        if(targetLegs()){
            setLegsCircuit();
            //To have something more readable on the screen
            if(isFollowedByAnotherCircuit()){
                spaceCreator();
            }
        }
        if(targetArms()){
            setArmsCircuit();
            if(isFollowedByAnotherCircuit()){
                spaceCreator();
            }
        }
        if(targetCore()){
            setCoreCircuit();
            if(isFollowedByAnotherCircuit()){
                spaceCreator();
            }
        }
        if(targetBack()){
            setBackCircuit();
            if(isFollowedByAnotherCircuit()){
                spaceCreator();
            }
        }
        deliverWorkout();
    }
    //abstract methods to override in the subclasses
    abstract void setLegsCircuit();
    abstract void setArmsCircuit();
    abstract void setCoreCircuit();
    abstract void setBackCircuit();
    //method not to override in the subclasses that is part of the main function implementation
    private void deliverWorkout(){
        System.out.println("These were al the steps of your workout");
    }
    private void spaceCreator(){
        System.out.println("\n".repeat(2));
    }
    //methods that are called 'hooks' in this design pattern. It is optional to override them.
    public boolean isFollowedByAnotherCircuit(){return true;}
    public boolean targetLegs(){
        return true;
    }
    public boolean targetArms(){
        return true;
    }
    public boolean targetCore(){
        return true;
    }
    public boolean targetBack(){
        return true;
    }
    //getters
    public String[] getLegsExercises() {
        return legsExercices;
    }
    public String[] getArmsExercises() {
        return armsExercices;
    }
    public String[] getCoreExercises() {
        return coreExercices;
    }
    public String[] getBackExercises() {
        return backExercices;
    }
}
