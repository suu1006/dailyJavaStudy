package com.example.dailystudy.interfacePrac;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();

        car.run();

        car.tire1 = new KumhoTire();
        car.tire2 = new KumhoTire();

        car.run();
    }
}
