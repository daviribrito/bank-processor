package com.davi.bankprocessor;

import java.math.BigDecimal;

public class BankAccount{
    private String accountNumber;
    private BigDecimal balance;
    private User owner;

    public BankAccount(String accountNumber, BigDecimal balance, User owner){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;

    }
}