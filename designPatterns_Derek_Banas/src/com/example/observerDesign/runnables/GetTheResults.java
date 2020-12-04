package com.example.observerDesign.runnables;

import com.example.observerDesign.obsInterfaces.Subject;
import com.example.observerDesign.observersClasses.RaceDispatcher;

import java.text.DecimalFormat;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.DoubleStream;

public class GetTheResults implements Runnable {
    private String team;
    private double time;
    private Subject raceDispatcher;
    private int startTime;

    public GetTheResults(Subject raceDispatcher, String newTeam, double newTime, int startTime){
        this.raceDispatcher = raceDispatcher;
        team = newTeam;
        time = newTime;
        this.startTime = startTime;
    }
    @Override
    public void run() {
        for(int i = 1; i <= 20; i++){
            try{
                Thread.sleep(startTime);
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }
        }
        Random randomTime = new Random();
        int randomAdvance = randomTime.nextInt(5000);
        this.time = this.time+randomAdvance;
        if(team=="My team"){
            ((RaceDispatcher) raceDispatcher).setOwnTeam(time);
        }
        else if(team=="Ennemy Club"){
            ((RaceDispatcher) raceDispatcher).setOtherTeam(time);
        }
        else if(team=="Random Club"){
            ((RaceDispatcher) raceDispatcher).setThirdTeam(time);
        }
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("Result : "+ team + " time = "+ df.format(this.time) +"\n");
    }
}
