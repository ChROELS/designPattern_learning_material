package com.example.SingletonDesign;

import java.util.LinkedList;

public class DistributeTiles implements Runnable{
    @Override
    public void run() {
        //Singleton Class is being used to create a unique Scrabble set for both players
        SingleScrabbleSet singleScrabbleSet = SingleScrabbleSet.getInstance();
        //Object stays the same but its value (ex. List of letters is dynamically updated)
        System.out.println("1st Instance ID: " + singleScrabbleSet.hashCode());
        System.out.println("All letters available: " + singleScrabbleSet.getLetterList());
        LinkedList<String> playerOneTiles = singleScrabbleSet.getTiles(7);
        System.out.println("Player: "+ playerOneTiles);
        System.out.println("Distribution completed");
    }
}
