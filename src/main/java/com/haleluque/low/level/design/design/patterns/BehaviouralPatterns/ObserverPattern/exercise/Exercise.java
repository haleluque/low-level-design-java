package com.haleluque.low.level.design.design.patterns.BehaviouralPatterns.ObserverPattern.exercise;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double priceChangeThreshold = sc.nextDouble();
        StockMarket stockMarket = new StockMarket(priceChangeThreshold);

        InvestorA investorA = new InvestorA();
        InvestorB investorB = new InvestorB();

        // Register Investor A as an observer to receive stock updates.
        stockMarket.registerObserver(investorA);

        // Register Investor B as an observer to receive stock updates.
        stockMarket.registerObserver(investorB);


        int updates = sc.nextInt();

        for (int i = 1; i <= updates; i++) {
            if(i == 5) {
                // Remove Investor B from receiving notifications after the 4th update.
                stockMarket.removeObserver(investorB);
            }

            String stockSymbol = sc.next();
            double newPrice = sc.nextDouble();
            double oldPrice = sc.nextDouble();

            // Update the stock price
            stockMarket.setStockPrice(stockSymbol, newPrice, oldPrice);

        }
        sc.close();
    }
}
