package com.example.dailystudy.interfaceDir;

public class Audio implements RemoteControl{

    private int volume;
    @Override
    public void turnOn() {
        System.out.println("Audio 켜기");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio 끄기");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 Audio 볼륨 : " + this.volume);
    }
}
