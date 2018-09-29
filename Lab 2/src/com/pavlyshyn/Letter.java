package com.pavlyshyn;

public class Letter {
    char symbol;

    public Letter(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return "Letter{" +
                "symbol=" + symbol +
                '}';
    }
}
