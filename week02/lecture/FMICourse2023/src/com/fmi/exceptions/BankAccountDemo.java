package com.fmi.exceptions;

public class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(100);
        bankAccount.withdraw(10);
        bankAccount.withdraw(10);
    }
}
