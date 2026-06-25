package com.mmit.stock;

public class TestStock {

    public static void main(String[] args) {

        Stock s1 = StockSingleton.getStock();
        Stock s2 = StockSingleton.getStock();

        s1.viewQuote();
        s1.getQuote();
        s1.setQuote();

        System.out.println(s1 == s2);

        Stock s3 = StockSingleton.getStock();
        System.out.println(s2 == s3);
    }
}