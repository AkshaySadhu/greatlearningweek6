package com.greatlearning.designpattern2;

import com.greatlearning.designpattern3.CurrencyConvertor;

public class Main {
    public static void main(String[] args) {
        Savings savings = new Savings();
        savings.setAccountNumber(123);
        savings.setBranch("Bangalore");
        savings.setBalance(1000);

        System.out.println("Savings Account: " + savings.getAccountNumber() + " Branch : "+ savings.getBranch() + " Balance: " + savings.getBalance());

        Current current = new Current();
        current.setAccountNumber(321);
        current.setBranch("Chennai");
        current.setBalance(5000);

        System.out.println("Current Account: " + current.getAccountNumber() + " Branch : "+ current.getBranch() + " Balance: " + current.getBalance());


    }
}
