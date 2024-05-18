package com.example.immutability;

import java.util.HashMap;
import java.util.Map;

// this is an example of an immutable class

//make class final so it can't be extended
final class ImmutableCar {
    private final String color;
    private final String regNo;
    private final Map<String,String> attributes;

    public ImmutableCar(String color, String regNo, Map<String, String> attributes) {
        this.color = color;
        this.regNo = regNo;
        // Creating Map object with reference to HashMap
        // Declaring object of string type
        Map<String, String> tempMap = new HashMap<>();

        // Iterating using for-each loop
        for (Map.Entry<String, String> entry :
                attributes.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }

        this.attributes = tempMap;
    }

    public String getColor() {
        return color;
    }

    public String getRegNo() {
        return regNo;
    }

    public Map<String, String> getAttributes() {
        Map<String, String> tempMap = new HashMap<>();

        for (Map.Entry<String, String> entry :
                this.attributes.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }
        return tempMap;
    }
}
