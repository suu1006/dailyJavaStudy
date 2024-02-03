package com.example.dailystudy.jenericPack;

public class CarAgency implements Rentable<Car>{

    @Override
    public Car rent() {
        return new Car(); // 리턴타입 반드시 Car이어야 함.
    }
}
