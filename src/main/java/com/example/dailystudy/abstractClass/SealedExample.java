package com.example.dailystudy.abstractClass;

public class SealedExample {
    public static void main(String[] args) {
        Person p = new Person(); // 자식은 Employee와 Manager만 가능
        Employee e = new Employee(); // 자식 클래스 만들 수 없음.
        Manager m = new Manager(); // 자식 클래스 만들 수 있음.
        Director d = new Director(); // Person의 자식 클래스 안됨

        p.work();
        e.work();
        m.work();
        d.work();
    }
}
