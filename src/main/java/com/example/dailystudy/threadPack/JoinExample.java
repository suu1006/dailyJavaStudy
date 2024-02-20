package com.example.dailystudy.threadPack;

public class JoinExample {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();
        sumThread.start();
        try {
            sumThread.join(); // 기다렸다가 실행
        } catch(InterruptedException e) {
        }
        System.out.println("1~100 합 : " + sumThread.getSum());
    }
}
