package com.cafe.cafetdd.unit.Beverage;

public class Latte implements Beverage{
    @Override
    public String getName() {
        return "아메리카노";
    }

    @Override
    public int getPrice() {
        return 4500;
    }
}
