package com.example.commandDesign.receivers;

public class Television implements ElectronicDevice{
    private int volume;
    @Override
    public void on() {
        System.out.println("TV is on");
    }

    @Override
    public void off() {
        System.out.println("TV is off");
    }

    @Override
    public void volumeUp() {
        if(volume>=0 && volume<10){
        volume++;
        System.out.println("TV VOLUME is up: " + volume);
        }else {
            volume=10;
            System.out.println("TV VOLUME is on max");
        }
    }

    @Override
    public void volumeDown() {
        if(volume>0){
            volume--;
            System.out.println("TV VOLUME is down: " + volume);
        }else {
            volume=0;
            System.out.println("TV VOLUME is on mute");
        }

    }
}
