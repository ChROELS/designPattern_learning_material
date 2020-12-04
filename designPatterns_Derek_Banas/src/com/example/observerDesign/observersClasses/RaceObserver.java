package com.example.observerDesign.observersClasses;

import com.example.observerDesign.obsInterfaces.Observer;
import com.example.observerDesign.obsInterfaces.Subject;

public class RaceObserver implements Observer {
    private double ownTeam;
    private double otherTeam;
    private double thirdTeam;
    private static int observerIDTracker = 0;
    private int observerId;
    private Subject raceDispatcher;

    public RaceObserver(Subject raceDispatcher){
        this.raceDispatcher = raceDispatcher;
        this.observerId = ++observerIDTracker;
        System.out.println("New Observer "+ observerId);
        raceDispatcher.register(this);
    }
    @Override
    public void update(double ownTeamTime, double otherTeamTime, double thirdTeamTime) {
        this.ownTeam = ownTeamTime;
        this.otherTeam = otherTeamTime;
        this.thirdTeam = thirdTeamTime;
        printResults();
    }
    public void printResults(){
        System.out.println("Observer's ID: "+observerId+" : own team time = "+ ownTeam +
                " vs \nother teams time = " + otherTeam + "; "+ thirdTeam);
    }
}
