package com.example.immutability.deepcopy;

public class User implements Cloneable{
    private String firstName;
    private String lastName;
    private Address address;

    public User(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    // copy constructor for deep copy
    public User(User u) {
        firstName = u.firstName;
        lastName = u.lastName;
        address = u.address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return new User(firstName,lastName,(Address)address.clone());
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getAddress() {
        return address;
    }

}
