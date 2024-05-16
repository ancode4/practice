package com.example.designpatterns.factory;

public class Main {
    public static void main(String[] args){
        FuelPriceFactory fuelPriceFactory = new FuelPriceFactory();
        FuelPrice petrolPrice = fuelPriceFactory.getFuelPrice("Petrol");
        double petrol = petrolPrice.calculate(20);
        System.out.println(petrol);

        FuelPrice diesel = fuelPriceFactory.getFuelPrice("Diesel");
        double dieselPrice = diesel.calculate(20);
        System.out.println(dieselPrice);
    }
}
