package com.example.dailystudy.interfaceDir;

public class MultiInterfaceImplExample {
    public static void main(String[] args) {
        RemoteControl2 rc = new SmartTelevision(); // 구현한 객체가 와야함.
        rc.turnOn();
        rc.turnOff();

        Searchable sc = new SmartTelevision();
        sc.search("http://www.youtube.com");



    }
}
