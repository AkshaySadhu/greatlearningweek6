package com.greatlearning.designpattern2;

public interface BankAccount {
    void setAccountNumber(int accountNumber);
    void setBranch(String branch);
    void setBalance(int balance);
    int getAccountNumber();
    String getBranch();
    int getBalance();
}
