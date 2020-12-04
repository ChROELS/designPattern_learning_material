package com.example.builderDesign;

import com.example.builderDesign.models.GenericRobot;

public interface RobotBuilder {
    void buildRobotHead();
    void buildRobotTorso();
    void buildRobotArms();
    void buildRobotLegs();
    GenericRobot getRobot();
}
