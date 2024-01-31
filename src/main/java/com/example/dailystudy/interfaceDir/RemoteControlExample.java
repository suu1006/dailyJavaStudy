package com.example.dailystudy.interfaceDir;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;
        rc = new Television();
        rc.turnOn();
        rc.setMute(true);
        rc.setMute(false);

        RemoteControl ad;
        ad = new Audio();
        ad.turnOn();

        System.out.println("리모컨 최대 볼륨 : " + RemoteControl.MAX_VOLUME);
        System.out.println("리모컨 최소 볼륨 : " + RemoteControl.MIN_VOLUME);

        RemoteControl.changeBattery();
    }
}
