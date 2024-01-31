package com.example.dailystudy.abstractClass;

public final class Employee extends Person{ // 봉인!
    @Override
    public void work() {
        System.out.println("제품을 생산합니다.");
    }
}
