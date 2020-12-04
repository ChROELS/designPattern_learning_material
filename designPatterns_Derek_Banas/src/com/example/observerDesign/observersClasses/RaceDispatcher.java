package com.example.observerDesign.observersClasses;

import com.example.observerDesign.obsInterfaces.Observer;
import com.example.observerDesign.obsInterfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class RaceDispatcher implements Subject {
    private List<Observer> observers;
    private double ownTeam;
    private double otherTeam;
    private double thirdTeam;

    public RaceDispatcher(){
        observers = new ArrayList<>();
    }

    @Override
    public Observer register(Observer o) {
        observers.add(o);
        return observers.get(observers.size()-1);
    }

    @Override
    public Observer unregister(Observer o) {
        int observerIndex = observers.indexOf(o);
        System.out.println("Observer "+ (observerIndex+1) +" deleted");
        return observers.remove(observerIndex);
    }

    @Override
    public void notifyObserver() {
        for (Observer obs:observers
             ) {
            obs.update(this.ownTeam, this.otherTeam, this.thirdTeam);
        }
    }

    public void setOwnTeam(double ownTeam) {
        this.ownTeam = ownTeam;
        notifyObserver();
    }

    public void setOtherTeam(double otherTeam) {
        this.otherTeam = otherTeam;
        notifyObserver();
    }

    public void setThirdTeam(double thirdTeam) {
        this.thirdTeam = thirdTeam;
        notifyObserver();
    }
}
