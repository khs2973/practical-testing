package com.cafe.cafetdd.unit.Beverage;

public class Americano implements Beverage{
    @Override
    public String getName() {
        return "Americano";
    }

    @Override
    public int getPrice() {
        return 3000;
    }
}
