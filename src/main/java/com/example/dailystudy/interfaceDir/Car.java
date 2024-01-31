package com.example.dailystudy.interfaceDir;

public class Car {
    Tire tire1 = new HankookTire();
    Tire tire2 = new HankookTire();

    void run() {
        tire1.roll(); // 인터페이스에 선언된 추상 메소드 호출, HankookTire의 roll() 메소드 호출
        tire2.roll();
    }

}
