package com.example.bridgeDesign;

/**With the Bridge Design Pattern you create 2 layers of abstraction
    *In this example I'll have an abstract class representing
    *different types of devices. I also have an abstract class
    *that will represent different types of remote controls;
    *This allows me to use an infinite variety of devices and remotes**/

public abstract class EntertainmentDeviceImplementor {
    public int deviceState;
    public int maxSetting;
    public int volumeLevel = 0;
    public int maxVolume;

    public abstract void buttonFivePressed();
    public abstract void buttonSixPressed();
    public abstract void buttonSevenVolUpPressed();
    public abstract void buttonEightVolDownPressed();

    public void deviceFeedBack(){
        if(deviceState > maxSetting || deviceState <0)
            deviceState = 0;
        System.out.println("On " + deviceState);
    }
    public void volumeFeedBack(){
        if(volumeLevel > maxVolume || volumeLevel <0)
            volumeLevel = 0;
        System.out.println("Volume on " + volumeLevel);
    }


}
