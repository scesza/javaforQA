package com.example.homework.lesson2.award;

public class Award {
    private final int aValue;
    private final String currency;
    private final String aName;
    private Double aSoli;
    private double quantity;

    public Award(String aName, int aValue, String currency, double soli) {
        this.aValue = aValue;
        this.aName = aName;
        this.currency = currency;
        this.aSoli = soli;
    }

    public Award(String aName, int aValue, String currency) {
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

    public void setAwardSoli(double soli) {
        this.aSoli = soli;
    }

    public Double getAwardSoli() {
        return aSoli;
    }

    public void setAwardQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getAwardQuantity() {
        return quantity;
    }
}
