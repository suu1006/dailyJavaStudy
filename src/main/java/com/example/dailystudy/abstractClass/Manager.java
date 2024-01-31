package com.example.dailystudy.abstractClass;

public non-sealed class Manager extends Person{ // 봉인 해제!
    @Override
    public void work() {
        System.out.println("생산 관리를 합니다.");
    }
}
