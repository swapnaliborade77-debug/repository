package com.mmit.stock;

public class StockSingleton {

    private static Stock stock;

    public static Stock getStock() {

        if (stock == null) {
            stock = new Stock();
        }

        return stock;
    }
}