package com.example.dailystudy.threadPackage;

public class InterruptExample {
    public static void main(String[] args) {
        Thread thread = new PrintThread();
        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }

        thread.interrupt(); 
    }
}
