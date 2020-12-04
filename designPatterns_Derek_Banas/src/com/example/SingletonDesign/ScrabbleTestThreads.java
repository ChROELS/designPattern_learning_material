package com.example.SingletonDesign;

public class ScrabbleTestThreads {
    public static void main(String[] args) {
        Runnable distributionOne = new DistributeTiles();
        Runnable distributeTiles = new DistributeTiles();
        new Thread(distributionOne).start();
        new Thread(distributeTiles).start();
    }
}
