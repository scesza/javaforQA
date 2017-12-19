package com.example.homework.lesson2.award;

public class Award {
    private final int aValue;
    private final String currency;
    private final String aName;

    public Award(String aName, Integer aValue, String currency) {
        this.aValue = aValue;
        this.aName = aName;
        this.currency = currency;
    }
    public int getAwardValue() {
        return aValue;
    }
    public String getAwardName() {
        return aName;
    }
    public String getAwardCurrency() {
        return currency;
    }
}
