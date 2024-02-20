package com.example.dailystudy.threadPack;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.font.TextAttribute;
import java.awt.im.InputMethodHighlight;
import java.awt.image.ColorModel;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.net.URL;
import java.util.Map;
import java.util.Properties;

public class BeepPrintExample {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i=0; i<5; i++) {
            toolkit.beep(); // beep음 발생
            try { Thread.sleep(500);} catch(Exception e) {} // 0.5초간 일시 정지
        }

        for (int i=0; i<5; i++) {
            System.out.println("띵");
            try { Thread.sleep(500);} catch (Exception e) {
            }
        }
    }
}
