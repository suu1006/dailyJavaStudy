package com.example.dailystudy.exceptionPrac;

import javax.naming.InsufficientResourcesException;

public class Account {
    private long balance;

    public Account() {}

    public long getBalance() {
        return balance;
    }

    public void deposit(int money) {
        balance += money; // balanace = balance + money // 예금
    }

    public void withdraw(int money) throws InsufficientException { // 출금
        if(balance < money){
            throw new InsufficientException("잔고부족!!" + (money -balance) + "모자람");
        }
        balance -= money;

    }
}
