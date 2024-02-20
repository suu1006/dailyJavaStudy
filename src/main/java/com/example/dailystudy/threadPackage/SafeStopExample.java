package com.example.dailystudy.threadPackage;

public class SafeStopExample {
    public static void main(String[] args) {
        PrintThread printThread = new PrintThread();
        printThread.start();

        try {
            Thread.sleep(30000);
        }catch (InterruptedException e) {

        }
        printThread.setStop(true);
    }
}
