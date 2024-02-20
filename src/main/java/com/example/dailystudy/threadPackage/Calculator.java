package com.example.dailystudy.threadPackage;

import ch.qos.logback.core.encoder.JsonEscapeUtil;

public class Calculator {
    private int memory;

    public int getMemory() {
        return memory;
    }

    public synchronized void setMemory1(int memory) {
        this.memory = memory;
        try {
            Thread.sleep(2000); // 일시정지
        } catch (InterruptedException e) { // interrupt >> 스레드 종료
            //
        }
        System.out.println(Thread.currentThread().getName() + ": " + this.memory);
    }

    public void setMemory2 (int memory) {
        synchronized (this) {
            this.memory = memory;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + ": " + this.memory);
            }
        }
    }
}
