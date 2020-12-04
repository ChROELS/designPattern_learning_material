package com.example.commandDesign;

import com.example.commandDesign.commands.TVRemotePower;
import com.example.commandDesign.commands.TVRemoteSound;
import com.example.commandDesign.invokers.DeviceButton;
import com.example.commandDesign.invokers.TVRemote;
import com.example.commandDesign.receivers.ElectronicDevice;

public class PlayWithRemote {
    public static void main(String[] args) {
        //the receiver obtained through a special invoker TVRemote
        ElectronicDevice tv = TVRemote.getDevice();
        //the commands. A command is an object with a method execute and a method undo, a receiver fo instance variable
        TVRemotePower turnOn = new TVRemotePower(tv);
        TVRemoteSound soundOn = new TVRemoteSound(tv);
        //the invokers. An invoker is an object with a method calling execute and a method calling undo,
        // from a command passed as an instance variable
        DeviceButton onPressed = new DeviceButton(turnOn);
        DeviceButton onPressedSound = new DeviceButton(soundOn);
        //actions
        onPressed.press();
        onPressed.pressUndo();
        onPressedSound.press();
        onPressedSound.pressUndo();
        onPressedSound.pressUndo();
    }
}
