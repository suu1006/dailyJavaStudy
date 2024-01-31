package com.example.dailystudy.anonymousPack;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();

        car.run1(); // 익명 자식 객체

        car.run2(); // 익명 자식 객체가 대입된ㅇ로컬 변수 이용

        car.run3(new Tire() {
            @Override
            public void roll() { // 재정의된 익명 자식 객체의 roll() 메소드가 호출됨.
                System.out.println("익명 자식 Tire 객체 3이 굴러갑니다.");
            }
        });
    }
}
