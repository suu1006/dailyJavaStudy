package com.example.dailystudy.exam01;

public class A {
    static class B {}

    B field = new B();

    static B field2 = new B();

    A() {
        // 로컬 클래스 선언
        class B {}
        B b = new B();
    }

    void method() {
        // 로컬 클래스 선언
        class B {}
        B b = new B();
    }

    static void method2() {
        // 로컬 객체 생성
        B b = new B();
    }
}
