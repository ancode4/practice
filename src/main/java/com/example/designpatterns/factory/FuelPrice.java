package com.example.designpatterns.factory;

public abstract class FuelPrice {
    protected double ratePerLitre;
    public double calculate(double litres) {
        return ratePerLitre*litres;
    }
}
