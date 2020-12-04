package com.example.commandDesign.commands;

import com.example.commandDesign.receivers.ElectronicDevice;

public class TVRemotePower implements Command {
    ElectronicDevice tv;

    public TVRemotePower(ElectronicDevice tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void undo() {
        tv.off();
    }
}
