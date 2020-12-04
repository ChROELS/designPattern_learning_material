package com.example.commandDesign.invokers;

import com.example.commandDesign.commands.Command;

public class DeviceButton {
    Command tvCommand;
    public DeviceButton(Command newCommand){
        tvCommand = newCommand;
    }
    public void press(){
        tvCommand.execute();
    }
    public void pressUndo(){
        tvCommand.undo();
    }
}
