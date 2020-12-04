package com.example.bridgeDesign.devices;

import com.example.bridgeDesign.EntertainmentDeviceImplementor;

public class MusicPlayer extends EntertainmentDeviceImplementor {
    public MusicPlayer(int deviceState, int maxSetting, int maxVolume) {
        super.deviceState = deviceState;
        super.maxSetting = maxSetting;
        super.maxVolume = maxVolume;

    }

    @Override
    public void buttonFivePressed() {
        deviceState++;
        System.out.println("Music track: next");
    }

    @Override
    public void buttonSixPressed() {
        deviceState--;
        System.out.println("Music track: previous");
    }
    public void buttonSevenVolUpPressed(){
        if(volumeLevel<super.maxVolume)
        volumeLevel++;
        System.out.println("Volume up at: "+ volumeLevel);
    }
    public void buttonEightVolDownPressed(){
        if(volumeLevel>0)
        volumeLevel--;
        System.out.println("Volume down at: "+ volumeLevel);
    }
}
