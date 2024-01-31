package com.example.dailystudy.interfaceDir;

public interface RemoteControl {
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;
    // 추상 메소드 선언
    void turnOn();
    void turnOff();
    void setVolume(int volume);

    default void setMute(boolean mute) {
        if(mute) {
            System.out.println("무음 처리합니다.");
        } else {
            System.out.println("무음 해제합니다.");
        }
    }

    static void changeBattery() {
        // 추상 메소드, 디폴트 메소드, private 메소드 호출 불가.
        // 구현 객체가 필요한 인스턴스 메소드이기 때문.

        System.out.println("리모컨 건전지 교환해~!");
    }
}
