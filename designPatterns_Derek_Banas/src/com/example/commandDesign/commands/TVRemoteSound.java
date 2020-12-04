package com.example.commandDesign.commands;

import com.example.commandDesign.receivers.ElectronicDevice;

public class TVRemoteSound implements Command {
    private ElectronicDevice electronicDevice;

    public TVRemoteSound(ElectronicDevice electronicDevice) {
        this.electronicDevice = electronicDevice;
    }

    @Override
    public void execute() {
        electronicDevice.volumeUp();
    }

    @Override
    public void undo() {
        electronicDevice.volumeDown();
    }
}
