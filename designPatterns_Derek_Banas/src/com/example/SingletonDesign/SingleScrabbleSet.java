package com.example.SingletonDesign;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

/**
 * This a Singleton class where the constructor is made private to avoid users creating instances.
 * Only through the static method getInstance(), an object is created (lazy instantiation).
 * With the use of threads, this has to happen at first
 */
public class SingleScrabbleSet {
    //Class variable
    private static SingleScrabbleSet scrabbleSet = null;
    //To slow down first thread
    static boolean firstThread = true;
    //Instance variable
    String[] enScrabbleLetters = {"a", "a", "a", "a", "a", "a", "a", "a", "a",
            "b", "b", "c", "c", "d", "d", "d", "d", "e", "e", "e", "e", "e",
            "e", "e", "e", "e", "e", "e", "e", "f", "f", "g", "g", "g", "h",
            "h", "i", "i", "i", "i", "i", "i", "i", "i", "i", "j", "k", "l",
            "l", "l", "l", "m", "m", "n", "n", "n", "n", "n", "n", "o", "o",
            "o", "o", "o", "o", "o", "o", "p", "p", "q", "r", "r", "r", "r",
            "r", "r", "s", "s", "s", "s", "t", "t", "t", "t", "t", "t", "u",
            "u", "u", "u", "v", "v", "w", "w", "x", "y", "y", "z"};
    private final LinkedList<String> letterList = new LinkedList<>(Arrays.asList(enScrabbleLetters));
    //Constructor
    private SingleScrabbleSet(){}
    //Getters
    public static SingleScrabbleSet getInstance(){
        if(scrabbleSet==null){
            // This is to test what happens if threads try to create instances of this class
            if(firstThread){
                firstThread = false;
                try{
                    Thread.currentThread();
                    Thread.sleep(1000);
                }catch(InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        }
        // synchronized (to force a thread to wait for its turn) when the first object is created
        synchronized (SingleScrabbleSet.class){
            //We create a new instance only if it has not been made before
            if(scrabbleSet==null){
                scrabbleSet = new SingleScrabbleSet();
                Collections.shuffle(scrabbleSet.letterList);
            }
        }
        return scrabbleSet;
    }
    public LinkedList<String> getLetterList(){
        return scrabbleSet.letterList;
    }
    public LinkedList<String> getTiles(int amount){
        LinkedList<String> playerTiles = new LinkedList<>();
        for(int i = 0; i<amount;i++){
            playerTiles.add(scrabbleSet.letterList.remove(0));
        }
        return  playerTiles;
    }
    }