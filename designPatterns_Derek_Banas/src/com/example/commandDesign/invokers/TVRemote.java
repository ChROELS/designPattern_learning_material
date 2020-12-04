package com.example.commandDesign.invokers;

import com.example.commandDesign.receivers.ElectronicDevice;
import com.example.commandDesign.receivers.Television;

public class TVRemote {
    public static ElectronicDevice getDevice(){
        return new Television();
    }
}
