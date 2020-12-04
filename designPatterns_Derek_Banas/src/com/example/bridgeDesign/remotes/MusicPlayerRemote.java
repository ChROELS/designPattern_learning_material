package com.example.bridgeDesign.remotes;

import com.example.bridgeDesign.EntertainmentDeviceImplementor;
import com.example.bridgeDesign.RemoteButton;

public class MusicPlayerRemote extends RemoteButton {
    private boolean mute = false;

    public MusicPlayerRemote(EntertainmentDeviceImplementor device) {
        super(device);
    }

    @Override
    public void buttonNinePressed() {
        mute = true;
        System.out.println("Sound setting on mute");
    }
}
