package com.example.dailystudy.exam02;

public class AA {

    String field = "A-field";

    void method() {
        System.out.println("A-method");
    }

    class B {
        String field = "B-field";

        void method() {
            System.out.println("B-method");
        }

        void print(){
            System.out.println(AA.this.field);
            AA.this.method();
        }
    }

    void useB() {
        B b = new B();
        b.print();
    }

}
