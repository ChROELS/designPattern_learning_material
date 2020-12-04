package com.example.observerDesign;

import com.example.observerDesign.observersClasses.RaceDispatcher;
import com.example.observerDesign.observersClasses.RaceObserver;
import com.example.observerDesign.runnables.GetTheResults;

public class RowingRace {
    public static void main(String[] args) {
        RaceDispatcher raceDispatcher = new RaceDispatcher();
        RaceObserver observer1 = new RaceObserver(raceDispatcher);

        Runnable getOwnTeam = new GetTheResults(raceDispatcher,"My team", 0.12, 1000);
        Runnable getSecondTeam = new GetTheResults(raceDispatcher,"Ennemy Club", 0.24,1000);
        Runnable getThirdTeam = new GetTheResults(raceDispatcher,"Random Club",0.00,1000);

        new Thread(getOwnTeam).start();
        new Thread(getSecondTeam).start();
        new Thread(getThirdTeam).start();
    }
}
