package com.greatlearning.designpattern2;

public class Current implements BankAccount{
    private int accountNumber;
    private String branch;
    private int balance;
    @Override
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public int getAccountNumber() {
        return this.accountNumber;
    }

    @Override
    public String getBranch() {
        return this.branch;
    }

    @Override
    public int getBalance() {
        return this.balance;
    }
}
