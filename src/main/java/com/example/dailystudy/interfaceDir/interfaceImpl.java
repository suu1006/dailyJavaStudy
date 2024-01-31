package com.example.dailystudy.interfaceDir;

public class interfaceImpl {
    public static void main(String[] args) {
        InterfaceC c = new InterfaceC(); // 부모 + 자식에게 있는 것 가능
        InterfaceB b = new InterfaceC(); // 자신한테 있는 것만 가능
        InterfaceA a = new InterfaceC(); // 부모한테 있는 것만 가능

        a.methodA();
        b.methodB();
        c.methodA();
        c.methodC();
        c.methodB();
    }







}
