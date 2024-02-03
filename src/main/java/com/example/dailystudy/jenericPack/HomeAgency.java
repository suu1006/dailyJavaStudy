package com.example.dailystudy.jenericPack;

public class HomeAgency implements Rentable<Home>{
    @Override
    public Home rent() {
        return new Home(); // return 타입 반드시 Home이어야 함.
    }
}
