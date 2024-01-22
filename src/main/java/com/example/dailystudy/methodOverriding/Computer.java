package com.example.dailystudy.methodOverriding;

public class Computer extends Calculator{
    @Override
    public double areaCircle(double r) {
        System.out.println("Computer객체의 areaCircle() 실행");
        return Math.PI * r * r;
        /**
         * 좀 더 정확히 값을 계산하기 위해, Math.PI를 사용해서 메소드 오버라이딩함.
         */
    }
}
