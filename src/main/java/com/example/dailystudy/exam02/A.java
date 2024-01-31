package com.example.dailystudy.exam02;

public class A {

    void useB () {
        class B {
            int field = 1;
            // 정적 필드 -> java 17 부터
            static int field2 = 2;

            B() {
                System.out.println("B-생성자 실행");
            }

            void method1() {
                System.out.println("B-method1 실행");
            }

            // 정적 메소드 -> java 17 부터
            static void method2() {
                System.out.println("B-method2 실행");
            }
        }
    }
    static class B {
        int field1 = 1;

        static int field2 = 2;

        B() {
            System.out.println("B 생성자 실행");
        }

        void method1() {
            System.out.println("B-method1 실행");
        }

        static void method2(){
            System.out.println("B-method2 실행");
        }
    }
}
