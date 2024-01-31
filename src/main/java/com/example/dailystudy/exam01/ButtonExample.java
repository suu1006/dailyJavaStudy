package com.example.dailystudy.exam01;

public class ButtonExample {
    public static void main(String[] args) {
        Button btnOk = new Button();
        class OkListener implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("ok 버튼을 클릭했습니다.");
            }
        }

        btnOk.setClickListener(new OkListener());

        btnOk.click();

        Button btnCancle = new Button();

        class CancelListenel implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("Cancel 버튼을 클릭했습니다.");
            }
        }
    }
}
