package com.example.dailystudy.collection;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExamlple {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();

        scores.add(87);
        scores.add(98);
        scores.add(75);
        scores.add(95);
        scores.add(80);

        for(Integer s : scores) {
            System.out.println(s + " ");
        }
        System.out.println("\n");
        NavigableSet<Integer> drscendingScores = scores.descendingSet();
        for(Integer s : drscendingScores) {

        }
    }
}
