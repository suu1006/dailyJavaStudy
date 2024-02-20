package com.example.dailystudy.threadPackage;

public class PrintThread extends Thread{
    private boolean stop;

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    public void run() {
        while(!stop) {
            System.out.println("실행 중");
            //Thread.sleep(1);
        }
        System.out.println("리소스 정리");
        System.out.println("실행 종료");
    }
}
