package com.example.dailystudy.exam01;

public class Button {
    public static interface ClickListener {
        void onClick();
    }

    private ClickListener clickListener;

    public void setClickListener(ClickListener clickListener) { // setter를 추가해서 외부에서 Setter를 통해 ClickListener 구현 객체를 저장
        this.clickListener = clickListener;
    }

    public void click() {
        this.clickListener.onClick();
    }
}
