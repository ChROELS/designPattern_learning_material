package com.example.bridgeDesign.devices;

import com.example.bridgeDesign.EntertainmentDeviceImplementor;

public class VideoGamePlayer extends EntertainmentDeviceImplementor {
    public VideoGamePlayer(int deviceState, int maxSetting, int maxVolume) {
        super.deviceState = deviceState;
        super.maxSetting = maxSetting;
        super.maxVolume = maxVolume;
    }

    @Override
    public void buttonFivePressed() {
        System.out.println("Screen left");
        deviceState++;
    }

    @Override
    public void buttonSixPressed() {
        System.out.println("Screen right");
        deviceState--;
    }

    @Override
    public void buttonSevenVolUpPressed() {
        if(volumeLevel<super.maxVolume)
            volumeLevel++;
        System.out.println("Volume up at: "+ volumeLevel);
    }

    @Override
    public void buttonEightVolDownPressed() {
        if(volumeLevel>0)
            volumeLevel--;
        System.out.println("Volume down at: "+ volumeLevel);
    }
}
