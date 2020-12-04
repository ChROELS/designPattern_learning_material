package com.example.bridgeDesign;

import com.example.bridgeDesign.devices.MusicPlayer;
import com.example.bridgeDesign.devices.VideoGamePlayer;
import com.example.bridgeDesign.remotes.MusicPlayerRemote;
import com.example.bridgeDesign.remotes.VideoGameRemote;
import org.junit.Before;
import org.junit.Test;

public class TestDeviceRemote {
    EntertainmentDeviceImplementor boomBox;
    EntertainmentDeviceImplementor playStation;
    @Before
    public void createBoomBox(){
        boomBox = new MusicPlayer(1,100, 20);
    }
    @Before
    public void createPlayStation(){
        playStation = new VideoGamePlayer(1,3, 10);
    }
    @Test
    public void startMusicPlayer(){
        boomBox.deviceFeedBack();
        boomBox.buttonFivePressed();
        boomBox.buttonSixPressed();
        boomBox.buttonSevenVolUpPressed();
        boomBox.buttonEightVolDownPressed();
        boomBox.volumeFeedBack();
    }
    @Test
    public void addMuteFunctionalityThroughRemote(){
        RemoteButton musicPlayerRemote = new MusicPlayerRemote(boomBox);
        musicPlayerRemote.buttonNinePressed();
        musicPlayerRemote.buttonEightPressed();
        musicPlayerRemote.buttonSevenPressed();
        musicPlayerRemote.buttonSixPressed();
        musicPlayerRemote.buttonFivePressed();
        musicPlayerRemote.deviceFeedBack();
        musicPlayerRemote.volumeFeedBack();
    }
    @Test
    public void startPlayStation(){
        playStation.deviceFeedBack();
        playStation.buttonFivePressed();
        playStation.buttonSixPressed();
        playStation.buttonSevenVolUpPressed();
        playStation.buttonEightVolDownPressed();
        playStation.volumeFeedBack();
    }
    @Test
    public void addPauseFunctionalityThroughRemote(){
        RemoteButton videoGamePlayerRemote = new VideoGameRemote(playStation);
        videoGamePlayerRemote.buttonNinePressed();
        videoGamePlayerRemote.buttonEightPressed();
        videoGamePlayerRemote.buttonSevenPressed();
        videoGamePlayerRemote.buttonSixPressed();
        videoGamePlayerRemote.buttonFivePressed();
        videoGamePlayerRemote.deviceFeedBack();
        videoGamePlayerRemote.volumeFeedBack();
    }
}
