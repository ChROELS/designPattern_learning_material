package com.example.builderDesign;

import com.example.builderDesign.models.VintageRobot;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class TestRobotBuilder {
    RobotBuilder vintageToy;
    RobotEngineerService engineerService;

    @Before
    public void instantiate() {
    vintageToy = new VintageRobot();
    engineerService = new RobotEngineerService(vintageToy);
}
    @Test
    public void getBuilder(){
        Assert.assertNotNull(vintageToy);
    }
    @Test
    public void getEngineer(){
        Assert.assertNotNull(engineerService);
    }
    @Test
    public void makeRobot(){
        engineerService.makeRobot();
    }
    @Test
    public void showRobot(){
        engineerService.makeRobot(); //Arrange
        engineerService.getRobot().detailRobot(); //Act
        Assert.assertNotNull("Elements not styled", engineerService.getRobot()); //Assert
    }
}
