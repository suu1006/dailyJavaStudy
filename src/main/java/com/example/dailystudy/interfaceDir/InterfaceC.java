package com.example.dailystudy.interfaceDir;

public class InterfaceC implements InterfaceB, InterfaceA {

    public void methodC() {
        System.out.println("CCC");
    }

    @Override
    public void methodA() {
        System.out.println("AAA");

    }

    @Override
    public void methodB() {
        System.out.println("BBB");
    }
}
