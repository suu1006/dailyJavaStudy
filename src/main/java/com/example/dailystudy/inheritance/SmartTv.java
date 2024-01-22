package com.example.dailystudy.inheritance;

public class SmartTv extends Tv{

    public SmartTv(String color) {
        /**
         * 부모 클래스에서 기본 생성자가 없고,
         * 매개변수가 있는 생성자가 있으면 자식에서 무조건 정의해줄것.
         * 부모에서 매개변수 받는 생성자 없을 경우(=기본생성자만 있을 경우)
         * 숨겨져있는 super을 통해 기본 생성자가 호출됨.
         */
        super(color);

    }
}
