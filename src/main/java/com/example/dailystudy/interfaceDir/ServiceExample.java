package com.example.dailystudy.interfaceDir;

public class ServiceExample {
    public static void main(String[] args) {
        // 인터페이스 변수 선언과 구현 객체 대입
        Service service = new ServiceImpl();

        service.defaultMethod1();
        service.defaultMehtod2();

        Service.staticMethod1();
        Service.staticMethod2();
    }
}
