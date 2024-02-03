package com.example.dailystudy.jenericPack;

public class Box <T>{
    public T content;

    public boolean compare(Box<T> other) {
        boolean result = content.equals(other.content); // object.equals() 사용
        return result;
    }
}
