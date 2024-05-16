package com.example.designpatterns.factory;

public class FuelPriceFactory {
    // factory pattern used for encapsulating object creation
    // This means at runtime, you can decide the object which you want
    public FuelPrice getFuelPrice(String fuelType){
        if(fuelType == null){
            return null;
        }
        if(fuelType.equalsIgnoreCase("petrol")){
            return new PetrolPrice();
        }else if(fuelType.equalsIgnoreCase("diesel")){
            return new DieselPrice();
        }
        return null;
    }
}
