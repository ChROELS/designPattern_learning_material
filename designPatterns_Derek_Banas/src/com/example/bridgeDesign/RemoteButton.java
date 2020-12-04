package com.example.bridgeDesign;

public abstract class RemoteButton {
    //aggregation. They can exist without each other (a remote without a device and vice-versa)
    private final EntertainmentDeviceImplementor device;

    public RemoteButton(EntertainmentDeviceImplementor device) {
        this.device = device;
    }
    //bridge
    public void buttonFivePressed(){
        device.buttonFivePressed();
    }
    public void buttonSixPressed(){
        device.buttonSixPressed();
    }
    public void buttonSevenPressed(){
        device.buttonSevenVolUpPressed();
    }
    public void buttonEightPressed(){
        device.buttonEightVolDownPressed();
    }
    public void deviceFeedBack(){
        device.deviceFeedBack();
    }
    public void volumeFeedBack(){
        device.volumeFeedBack();
    }

    //abstract method
    public abstract void buttonNinePressed();
}
