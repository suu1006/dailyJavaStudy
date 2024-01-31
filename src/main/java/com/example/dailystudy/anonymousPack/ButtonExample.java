package com.example.dailystudy.anonymousPack;

import com.example.dailystudy.exam01.Button;

public class ButtonExample {
    public static void main(String[] args) {
        Button btnOk = new Button();

        btnOk.setClickListener(new Button.ClickListener(){
            @Override
            public void onClick() {
                System.out.println("ok 버튼을 클릭했습니다.");
            }
        });
        btnOk.click();

        Button btnCancle = new Button();

        btnCancle.setClickListener(new Button.ClickListener(){
            @Override
            public void onClick() {
                System.out.println("Cancel 버튼을 클릭했습니다.");
            }
        });
        btnCancle.click();
    }
}
