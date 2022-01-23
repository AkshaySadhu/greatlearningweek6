package com.greatlearning.designpattern3;

import java.util.Scanner;

public class MainCurrency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Currency Convertor");
        while (true){
            System.out.println("Enter Currency you want to convert");
            String currency = scanner.next();
            switch (currency){
                case "GBP": GBP gbp = new GBP();
                    System.out.println("Enter amount: ");
                    float amount = scanner.nextFloat();
                    amount = gbp.convertToINR(amount);
                    System.out.println("Converted: " + amount);

                case "USD": USD usd = new USD();
                    System.out.println("Enter amount: ");
                    amount = scanner.nextFloat();
                    amount = usd.convertToINR(amount);
                    System.out.println("Converted: " + amount);
            }
        }
    }
}
