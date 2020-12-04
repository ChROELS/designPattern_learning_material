package com.example.builderDesign.models;

import com.example.builderDesign.RobotBuilder;

public class VintageRobot implements RobotBuilder {
    private final GenericRobot genericRobot = new GenericRobot();

    @Override
    public void buildRobotHead() {
        genericRobot.setRobotHead("Helmet");
    }

    @Override
    public void buildRobotTorso() {
        genericRobot.setRobotTorso("A lot of buttons");
    }

    @Override
    public void buildRobotArms() {
        genericRobot.setRobotArms("Flexible conduit");
    }

    @Override
    public void buildRobotLegs() {
        genericRobot.setRobotLegs("Bike Wheels");
    }

    @Override
    public GenericRobot getRobot() {
        return genericRobot;
    }
}
