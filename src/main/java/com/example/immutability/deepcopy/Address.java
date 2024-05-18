package com.example.immutability.deepcopy;

public class Address {
    private String street;
    private String city;
    private String country;

    public Address(String street, String city, String country) {
        this.street = street;
        this.city = city;
        this.country = country;
    }

    // copy constructor which can be used for deep copy
    public Address(Address address){
        street = address.getStreet();
        city = address.getCity();
        country = address.getCountry();
    }

    // clone method can also be used for deep copy
    @Override
    protected Object clone() throws CloneNotSupportedException {
        try{
            return super.clone();
        }catch (CloneNotSupportedException exception){
            return new Address(getStreet(), getCity(), getCountry());
        }
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }
}
