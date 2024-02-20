package com.example.dailystudy.collection;

import java.util.TreeSet;

public class ComparatorExamlple {
    public static void main(String[] args) {
        TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new FruitComparator());

        treeSet.add(new Fruit("포도", 300));
        treeSet.add(new Fruit("수박", 10000));
        treeSet.add(new Fruit("딸기", 6000));

        for(Fruit fruit : treeSet) {
            System.out.println(fruit.name);
        }
    }
}
