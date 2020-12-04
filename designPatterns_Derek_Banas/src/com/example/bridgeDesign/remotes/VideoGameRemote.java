package com.example.bridgeDesign.remotes;

import com.example.bridgeDesign.EntertainmentDeviceImplementor;
import com.example.bridgeDesign.RemoteButton;

public class VideoGameRemote extends RemoteButton {
    private boolean pause = false;

    public VideoGameRemote(EntertainmentDeviceImplementor device) {
        super(device);
    }

    @Override
    public void buttonNinePressed() {
        pause = true;
        System.out.println("Game setting on pause");
    }
}
