package com.example.builderDesign;

import com.example.builderDesign.models.GenericRobot;

public class RobotEngineerService {
    private final RobotBuilder builder;

    public RobotEngineerService(RobotBuilder builder) {
        this.builder = builder;
    }
    public void makeRobot(){
        this.builder.buildRobotHead();
        this.builder.buildRobotTorso();
        this.builder.buildRobotArms();
        this.builder.buildRobotLegs();
    }
    public GenericRobot getRobot(){
        return this.builder.getRobot();
    }
}
