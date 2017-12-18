package com.example.homework.lesson2.award;

public class Award {
    private int aValue;
    private String currency;
    private String aName;


    public Award(final String aName, final Integer aValue, final String currency) {
        this.aValue = aValue;
        this.aName =  aName;
        this.currency =  currency;
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
