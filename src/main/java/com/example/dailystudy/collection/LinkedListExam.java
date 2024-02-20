package com.example.dailystudy.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExam {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new LinkedList<String>();

        long startTime;
        long endTime;

        // ArrayList
        startTime = System.nanoTime();
        for(int i=0; i<10000; i++) {
            list1.add(0, String.valueOf(i));
        }

        endTime = System.nanoTime();
        System.out.printf("arrayList 걸린 시간 : " + (endTime-startTime));

        // LinkedList
        startTime = System.nanoTime();
        for(int i=0; i<10000; i++) {
            list2.add(0, String.valueOf(i));
        }

        endTime = System.nanoTime();
        System.out.printf("LinkedList 걸린 시간 : " + (endTime - startTime));

    }
}
