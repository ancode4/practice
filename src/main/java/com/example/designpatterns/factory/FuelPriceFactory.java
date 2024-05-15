package com.example.designpatterns.factory;

public class FuelPriceFactory {
    // factory pattern used for encapsulating object creation
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
