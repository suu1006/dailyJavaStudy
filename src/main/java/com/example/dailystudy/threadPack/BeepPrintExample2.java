package com.example.dailystudy.threadPack;

import javax.tools.Tool;
import java.awt.*;

public class BeepPrintExample2 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for(int i=0; i<5; i++) {
                    toolkit.beep();
                    try {
                        Thread.sleep(500);
                    } catch(Exception e){};
                }
            }
        });

        thread.start();

        for(int i=0; i<5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500); // 0.5초간 일시정지
            } catch(Exception e){}
        }
    }
}
