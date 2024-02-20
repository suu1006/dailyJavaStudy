package com.example.dailystudy.threadPackage;

import java.awt.*;

public class threadPackage {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i=0; i<5; i++) {
            toolkit.beep();
            try {
                Thread.sleep(500);
            } catch(Exception e) {

            }
        }

        for (int i=0; i<5; i++) {
            System.out.println("띵");
        }
        try{
            Thread.sleep(500); // 0.5초 일시정지
        } catch(Exception e) {

        }
    }

}
