package com.example.dailystudy.threadPack;

public class WorkThread extends Thread{
    public boolean work = true;

    public WorkThread(String name) { // 생성자
        setName(name);
    }

    @Override
    public void run() { // 메소드
        while(true) {
            if(work) {
                System.out.println(getName() + "작업 처리");
            } else {
                Thread.yield();
            }
        }
    }

}
