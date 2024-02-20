package com.example.dailystudy.threadPackage;

public class ThreadA extends Thread{
    private WorkObject workObejct;

    public ThreadA(WorkObject workObject) {
        setName("ThreadA");
        this.workObejct = workObject;
    }

    @Override
    public void run() {
        for(int i=0; i<10; i++) {
            workObejct.methodA();
        }
    }

}
