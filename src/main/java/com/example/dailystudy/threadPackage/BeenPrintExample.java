package com.example.dailystudy.threadPackage;

import java.awt.*;

public class BeenPrintExample {
    public static void main(String[] args) {
        Thread thread = new Thread() {
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for(int i=0; i<5; i++) {
                    toolkit.beep();
                    try {
                        Thread.sleep(500);
                    } catch(Exception e) {

                    }
                }
            }
        };

        thread.start(); // 작업 스레드 실행

        for(int i=0; i<5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch(Exception e) {

            }
        }
    }
}
