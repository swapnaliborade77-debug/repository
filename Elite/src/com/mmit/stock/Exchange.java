package com.mmit.stock;

public class Exchange {

    private String exchangeName;

    public Exchange(String exchangeName) {
        this.exchangeName = exchangeName;
    }

    @Override
    public String toString() {
        return "Exchange [exchangeName=" + exchangeName + "]";
    }
}