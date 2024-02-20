package com.example.dailystudy.collection;

import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        List<Board> list = new Vector<>();
        Thread threadA = new Thread() {
            @Override
            public void run() {
                for(int i=1; i<=1000; i++) {
                    list.add(new Board("제목" + i , "내용" + i, "글쓴이" + i));
                }
            }
        };

        Thread threadB = new Thread() {
            @Override
            public void run() {
                for(int i=1001; i<=2000; i++) {
                    list.add(new Board("제목" + i , "내용" + i, "글쓴이" + i)); // Vector의 add는 동기화 메소드, 한번에 하나의 스레드만 실행
                }
            }
        };
        threadA.start();
        threadB.start();

        try {
            threadA.join();
            threadB.join();
        } catch (Exception e) {

        }
        int size = list.size();
        System.out.println("총 객체 수 : " + size);
        System.out.println();
    }
}
