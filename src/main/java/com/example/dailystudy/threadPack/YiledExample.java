package com.example.dailystudy.threadPack;

public class YiledExample {
    public static void main(String[] args) {
        WorkThread workThreadA = new WorkThread("wordThread");
        WorkThread workThreadB = new WorkThread("wordThread");
        workThreadA.start();
        workThreadB.start();

        try {
            Thread.sleep(5000);
        } catch(InterruptedException e){
        }
        workThreadA.work = false;

        try {
            Thread.sleep(10000);
        } catch(InterruptedException e){
        }
        workThreadB.work = true;
    }
}
