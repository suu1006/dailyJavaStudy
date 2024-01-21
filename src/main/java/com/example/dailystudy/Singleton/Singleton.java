package com.example.dailystudy.Singleton;

/**
 * singleton의 핵심은  생성자는 private
 * 필드는 private static
 * public 접근권한을 갖는 정적 메소드 선언 , getInstance()로 객체생성을 할 수 있도록 열어준다.
 */

public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {
        // 싱글톤 핵심.
    }

    public static Singleton getInstance() {
        return singleton;
    }
}


