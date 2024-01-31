package com.example.dailystudy.exam01;

public class AA {
    int field;
    void method1() {};

    static int field2;
    static void method2(){};

    class B {
        void method() {
            field = 10;
            method1();

            field = 20;
            method2();
        }
    }
    static class C {
        void method() {
            field2 = 10;
            method2();
        }
    }
}


