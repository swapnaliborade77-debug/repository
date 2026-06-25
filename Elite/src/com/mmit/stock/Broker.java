package com.mmit.stock;

public class Broker {

    private Stock stock;

    public Broker(Stock stock) {
        this.stock = stock;
    }

    public void buyStock() {
        System.out.println("Buying stock: " + stock);
    }
}