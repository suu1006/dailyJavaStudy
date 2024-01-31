package com.example.dailystudy.exceptionPrac;

public class AccountExample {
    public static void main(String[] args) {
        Account ac = new Account();

        ac.deposit(100000);
        System.out.println("예금액 : " + ac.getBalance());

        try {
            ac.withdraw(30000);
        } catch (InsufficientException e) {
            String message = e.getMessage();
            System.out.println(message);
        }

    }
}
